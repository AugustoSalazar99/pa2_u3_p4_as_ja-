package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.repository.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
@Transactional
public class HotelRepositoryImpl implements IHotelRepository{

	@PersistenceContext
	private EntityManager entityManager;
	


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
                this.entityManager.createQuery("SELECT h from Hotel h INNER JOIN h.habitaciones ha",Hotel.class);
        return myQuery.getResultList();
	}

	@Override
	public List<Hotel> seleccionarOuterRightJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Hotel> myQuery =
                this.entityManager.createQuery("SELECT h from Hotel h RIGHT JOIN h.habitaciones ha",Hotel.class);
        return myQuery.getResultList();
	}

	@Override
	public List<Hotel> seleccionarOuterLeftJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Hotel> myQuery =
                this.entityManager.createQuery("SELECT h from Hotel h LEFT JOIN h.habitaciones ha",Hotel.class);
        return myQuery.getResultList();
	}

	@Override
	public List<Habitacion> seleccionarHabitacionesOuterLeftJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Habitacion> myQuery =
                this.entityManager.createQuery("SELECT ha from Hotel h LEFT JOIN h.habitaciones ha",Habitacion.class);
        return myQuery.getResultList();
	}

	@Override
	public List<Habitacion> seleccionarHabitacionesOuterFulltJoin() {
		TypedQuery<Habitacion> myQuery =
                this.entityManager.createQuery("SELECT ha from Hotel h FULL JOIN h.habitaciones ha",Habitacion.class);
        return myQuery.getResultList();
	}

	@Override
	public List<Hotel> seleccionarWhereJoin() {

		//SELECT h FROM Hotel h, Habitacion ha WHERE h=ha.hotel
		TypedQuery<Hotel> myQuery =
                this.entityManager.createQuery("SELECT h FROM Hotel h, Habitacion ha WHERE h=ha.hotel",Hotel.class);
        return myQuery.getResultList();
	}

}
