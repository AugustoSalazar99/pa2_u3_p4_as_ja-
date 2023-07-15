package com.example.demo.repository;

import com.example.demo.repository.modelo.Doctor;

public interface IDoctorRepository {
	//DDL
	public void insertar(Doctor doctor);
	public void actualizar(Doctor doctor);
	public void eliminar(Integer id);
	public Doctor seleccionar(Integer id);
	
	//DML
	
	public Doctor reporte(Integer id,String nombre);

}
