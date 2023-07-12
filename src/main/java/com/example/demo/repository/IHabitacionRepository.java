package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Habitacion;

public interface IHabitacionRepository {
	

	
	public List<Habitacion> seleccionarTodo();
	public List<Habitacion> obtenerPorNumero(String numero);
}
