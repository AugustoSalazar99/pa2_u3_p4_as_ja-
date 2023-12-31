package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Hotel;

public interface IHotelRepository {
	
	public void insertar(Hotel hotel);
	public void actualizar(Hotel hotel);
	public void eliminar(Integer id);
	public Hotel buscar (Integer id);
	

	
	public List<Hotel> seleccionarInnerJoin();
}
