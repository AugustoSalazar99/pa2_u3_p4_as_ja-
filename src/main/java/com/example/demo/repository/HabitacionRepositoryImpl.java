package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.repository.modelo.Habitacion;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
@Transactional
public class HabitacionRepositoryImpl  implements IHabitacionRepository{

	
	//interpretar con hibernate
	@PersistenceContext
	private EntityManager entityManager;
	


	@Override
	public List<Habitacion> seleccionarTodo() {
		TypedQuery<Habitacion> query = this.entityManager.createQuery(
		        "SELECT h FROM Habitacion h", Habitacion.class);
		    return query.getResultList();
	}

	@Override
	public List<Habitacion>  obtenerPorNumero(String numero) {
	
		        TypedQuery<Habitacion> myquery = this.entityManager.createQuery(
		            "SELECT h FROM Habitacion h WHERE h.numero = :datoNumero", Habitacion.class);
		        myquery.setParameter("datoNumero", numero);
		        
		        return myquery.getResultList();
		
	}
	

}
