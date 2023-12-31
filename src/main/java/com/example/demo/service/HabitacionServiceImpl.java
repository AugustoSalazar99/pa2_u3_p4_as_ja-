package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IHabitacionRepository;
import com.example.demo.repository.modelo.Habitacion;

@Service
public class HabitacionServiceImpl implements IHabitacionService{
	@Autowired
	private IHabitacionRepository habitacionRepository;

	@Override
	public void insertar(Habitacion habitacion) {
		// TODO Auto-generated method stub
		this.habitacionRepository.insertar(habitacion);
	}

	@Override
	public void actualizar(Habitacion habitacion) {
		// TODO Auto-generated method stub
		this.habitacionRepository.actualizar(habitacion);
	}

	@Override
	public void eliminar(String id) {
		// TODO Auto-generated method stub
		this.habitacionRepository.eliminar(id);
	}

	@Override
	public Habitacion buscar(String id) {
		// TODO Auto-generated method stub
		return this.habitacionRepository.buscar(id);
	}

	@Override
	public List<Habitacion> reporteTodo() {
		// TODO Auto-generated method stub
		return this.habitacionRepository.seleccionarTodo();
	}

	@Override
	public List<Habitacion>  reportePorNumero(String numero) {
		// TODO Auto-generated method stub
		return this.habitacionRepository.obtenerPorNumero(numero);
	}

}
