package com.example.demo.repository;

import javax.print.Doc;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.repository.modelo.Doctor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

@Repository
@Transactional

public class DoctorRepositoryImpl implements IDoctorRepository{
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.entityManager.persist(doctor);
	}

	@Override
	public void actualizar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.entityManager.merge(doctor);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Doctor doc=this.seleccionar(id);
		this.entityManager.remove(doc);
	}

	@Override
	public Doctor seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Doctor.class, id);
	}

	@Override
	public Doctor reporte(Integer id, String nombre) {
		// TODO Auto-generated method stub
		CriteriaBuilder myBuilder = this.entityManager.getCriteriaBuilder();
		CriteriaQuery< Doctor> myQuery = myBuilder.createQuery(Doctor.class);
		Root<Doctor> miTabla = myQuery.from(Doctor.class);
		
		Predicate condid=myBuilder.equal(miTabla.get("id"), id);
		Predicate condNombre= myBuilder.equal(miTabla.get("nombre"), nombre);
		
		myQuery.select(miTabla).where(condid,condNombre);
		TypedQuery<Doctor> myTypedQuery = this.entityManager.createQuery(myQuery);
		
		return myTypedQuery.getSingleResult();
	}

}
