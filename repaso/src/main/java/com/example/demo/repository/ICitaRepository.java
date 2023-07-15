package com.example.demo.repository;

import com.example.demo.repository.modelo.Cita;


public interface ICitaRepository {
	//DDL
	public void insertar(Cita cita);
	public void actualizar(Cita cita);
	public void eliminar(Integer id);
	public Cita seleccionar(Integer id);

}
