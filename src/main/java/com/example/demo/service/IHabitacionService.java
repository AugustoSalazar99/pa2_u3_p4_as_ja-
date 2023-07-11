package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.repository.modelo.Hotel;

public interface IHabitacionService {
	public void insertar(Habitacion habitacion);
	public void actualizar(Habitacion habitacion);
	public void eliminar(String id);
	public Habitacion buscar(String id);
	
	public List<Habitacion> reporteTodo();
	
	public List<Habitacion>  reportePorNumero(String numero);



}
