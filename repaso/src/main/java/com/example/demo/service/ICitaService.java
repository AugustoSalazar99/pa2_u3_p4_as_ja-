package com.example.demo.service;

import com.example.demo.repository.modelo.Cita;
import com.example.demo.repository.modelo.Doctor;

public interface ICitaService {
	//DDL
		public void guardar(Cita cita);
		public void actualizar(Cita cita);
		public void eliminar(Integer id);
		public Cita reporte(Integer id);

}
