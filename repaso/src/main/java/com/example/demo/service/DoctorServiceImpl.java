package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IDoctorRepository;
import com.example.demo.repository.modelo.Doctor;

@Service

public class DoctorServiceImpl  implements IDoctorService{

	@Autowired
	private IDoctorRepository doctorRepository;
	@Override
	public void guardar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.doctorRepository.insertar(doctor);
	}

	@Override
	public void actualizar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.doctorRepository.actualizar(doctor);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.doctorRepository.eliminar(id);
	}

	@Override
	public Doctor reporte(Integer id) {
		// TODO Auto-generated method stub
		return this.doctorRepository.seleccionar(id);
	}

	@Override
	public Doctor reporte(Integer id, String nombre) {
		// TODO Auto-generated method stub
		return this.doctorRepository.reporte(id, nombre);
	}

}
