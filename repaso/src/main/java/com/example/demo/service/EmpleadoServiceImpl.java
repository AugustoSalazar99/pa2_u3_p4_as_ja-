package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IEmpleadoRepository;
import com.example.demo.repository.modelo.Empleado;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService{
	@Autowired
	private IEmpleadoRepository empleadoRepository;

	@Override
	public void guardar(Empleado empleado) {
		this.empleadoRepository.insertar(empleado);
		
	}

}
