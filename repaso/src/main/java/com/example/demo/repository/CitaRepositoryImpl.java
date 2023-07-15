package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.repository.modelo.Cita;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
@Transactional
public class CitaRepositoryImpl implements ICitaRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Cita cita) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cita);
	}

	@Override
	public void actualizar(Cita cita) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cita);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Cita cita= this.seleccionar(id);
		this.entityManager.remove(cita);
	}

	@Override
	public Cita seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Cita.class, id);
	}

}
