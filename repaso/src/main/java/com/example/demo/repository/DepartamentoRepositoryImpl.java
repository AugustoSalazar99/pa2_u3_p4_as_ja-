package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Departamento;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Table;

@Repository
@Table(name="departamento")
public class DepartamentoRepositoryImpl implements IDepartamentoRepository{
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Departamento departamento) {
		// TODO Auto-generated method stub
		this.entityManager.persist(departamento);
	}

}
