package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.repository.modelo.Hotel;

public interface IHotelService {
	

	
	public List<Hotel> buscarInnerJoin();
	
	public List<Hotel> buscarOuterRightJoin();
	public List<Hotel> buscarOuterLeftJoin();
	public List<Habitacion> buscarHabitacionesOuterLeftJoin();
	public List<Habitacion> buscarHabitacionesOuterFulltJoin();
	
	public List<Hotel> buscarWhereJoin();

}
