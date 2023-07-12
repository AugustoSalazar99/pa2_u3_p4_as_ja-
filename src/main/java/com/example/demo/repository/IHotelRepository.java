package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.repository.modelo.Hotel;

public interface IHotelRepository {
	

	

	
	public List<Hotel> seleccionarInnerJoin();
	
	
	public List<Hotel> seleccionarOuterRightJoin();
	public List<Hotel> seleccionarOuterLeftJoin();

	public List<Habitacion> seleccionarHabitacionesOuterLeftJoin();
	public List<Habitacion> seleccionarHabitacionesOuterFulltJoin();

	public List<Hotel> seleccionarWhereJoin();


}
