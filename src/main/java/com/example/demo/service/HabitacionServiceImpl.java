package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IHabitacionRepository;
import com.example.demo.repository.modelo.Habitacion;

@Service
public class HabitacionServiceImpl implements IHabitacionService{
	@Autowired
	private IHabitacionRepository habitacionRepository;

	

	@Override
	public List<Habitacion> reporteTodo() {
		// TODO Auto-generated method stub
		return this.habitacionRepository.seleccionarTodo();
	}

	@Override
	public List<Habitacion>  reportePorNumero(String numero) {
		// TODO Auto-generated method stub
		return this.habitacionRepository.obtenerPorNumero(numero);
	}

}
