package com.example.djdbc.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.djdbc.entities.Cliente;

@Repository
public class ClienteRepositoryDAO {
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	String querySelectAllClientes = "Select * from CLIENTE";
	
	String querySelectCliente = "Select * from CLIENTE where ID = ?";
	
	public class ClienteRowMapper implements RowMapper<Cliente>{
		@Override
		public Cliente mapRow(ResultSet rs, int rowNum) throws SQLException {
			Cliente cliente = new Cliente();
			cliente.setId(rs.getInt("ID"));
			cliente.setUsername(rs.getString("USERNAME"));
			cliente.setEmail(rs.getString("EMAIL"));
			cliente.setPassword(rs.getString("PASSWORD"));
			return cliente;
		}	
	}
	
	public List<Cliente> getAllClientes(){
		return jdbcTemplate.query(querySelectAllClientes, new ClienteRowMapper());
	}
	
	public Cliente getCliente(Integer id) {
		return jdbcTemplate.queryForObject(querySelectCliente,  new ClienteRowMapper(), new Object[]{id});
	}

}
