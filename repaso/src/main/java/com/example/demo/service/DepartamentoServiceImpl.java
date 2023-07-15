package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IDepartamentoRepository;
import com.example.demo.repository.modelo.Departamento;

@Service
public class DepartamentoServiceImpl implements IDepartamentoService{

	@Autowired
	private IDepartamentoRepository departamentoRepository;
	@Override
	public void guardar(Departamento departamento) {
		// TODO Auto-generated method stub
		this.departamentoRepository.insertar(departamento);
	}

}
