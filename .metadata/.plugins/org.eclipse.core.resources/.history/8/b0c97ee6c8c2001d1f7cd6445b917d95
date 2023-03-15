package com.example.djdbc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.djdbc.entities.Cliente;
import com.example.djdbc.repositories.ClienteRepositoryDAO;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteRepositoryDAO repository;
	
	@GetMapping("all")
	public List<Cliente> getAllClientes(){
		return repository.getAllClientes();
	}

}
