package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Habitacion;

public interface IHabitacionRepository {
	public void insertar(Habitacion habitacion);
	public void actualizar(Habitacion habitacion);
	public void eliminar(String id);
	public Habitacion buscar(String id);

	
	public List<Habitacion> seleccionarTodo();
	public List<Habitacion> obtenerPorNumero(String numero);
}
