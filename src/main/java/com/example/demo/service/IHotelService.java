package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Hotel;

public interface IHotelService {
	public void guardar(Hotel hotel);
	public void actulizar(Hotel hotel);
	public void eliminar(Integer id);
	public Hotel buscar(Integer id);

	
	public List<Hotel> buscarInnerJoin();

}
