package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.repository.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
@Transactional
public class HotelRepositoryImpl implements IHotelRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.entityManager.persist(hotel);
	}

	@Override
	public void actualizar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.entityManager.merge(hotel);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Hotel hot= this.buscar(id);
		this.entityManager.remove(hot);
	}

	@Override
	public Hotel buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Hotel.class, id);
	}

	//unidad3
	
	@Override
	public List<Hotel> seleccionarInnerJoin() {
		//utilizar el typedquery por vamos a consultar hotel
		//SQL=select * from hotel h inner join habitacion  ha on h.hot_id = ha.hab_id_hotel
		//transformar el sql a jpql
		//JPQL=SELECT h FROM Hotel JOIN h.Habitaciones ha 
		/*TypedQuery<Hotel> myQuery = 
				this.entityManager.createQuery("SELECT h FROM Hotel h JOIN h.habitaciones ha"
						,Hotel.class);
		
		
		return myQuery.getResultList();
		*/
		TypedQuery<Hotel> myQuery =
                this.entityManager.createQuery("SELECT h from Hotel h JOIN h.habitaciones ha",Hotel.class);
        return myQuery.getResultList();
	}

}
