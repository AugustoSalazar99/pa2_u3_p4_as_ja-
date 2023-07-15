package com.example.demo.repository;

import com.example.demo.repository.modelo.Paciente;

public interface IPacienteRepository {
	
	//DDL
		public void insertar(Paciente paciente);
		public void actualizar(Paciente paciente);
		public void eliminar(Integer id);
		public Paciente seleccionar(Integer id);

}
