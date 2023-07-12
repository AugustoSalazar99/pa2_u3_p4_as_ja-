package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Habitacion;


public interface IHabitacionService {

	
	public List<Habitacion> reporteTodo();
	
	public List<Habitacion>  reportePorNumero(String numero);



}
