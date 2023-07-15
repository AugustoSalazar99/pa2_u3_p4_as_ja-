package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ICitaRepository;
import com.example.demo.repository.modelo.Cita;
import com.example.demo.repository.modelo.Doctor;

@Service
public class CitaServiceImpl implements ICitaService{
	
	@Autowired
	private ICitaRepository citaRepository;

	@Override
	public void guardar(Cita cita) {
		// TODO Auto-generated method stub
		this.citaRepository.insertar(cita);
	}

	@Override
	public void actualizar(Cita cita) {
		// TODO Auto-generated method stub
		this.citaRepository.actualizar(cita);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.citaRepository.eliminar(id);
	}

	@Override
	public Cita reporte(Integer id) {
		// TODO Auto-generated method stub
		return this.citaRepository.seleccionar(id);
	}

}
