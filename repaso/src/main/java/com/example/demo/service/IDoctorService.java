package com.example.demo.service;

import com.example.demo.repository.modelo.Doctor;

public interface IDoctorService {
	//DDL
		public void guardar(Doctor doctor);
		public void actualizar(Doctor doctor);
		public void eliminar(Integer id);
		public Doctor reporte(Integer id);
		//DML
		
		public Doctor reporte(Integer id,String nombre);

}
