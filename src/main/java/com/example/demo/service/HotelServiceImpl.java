package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IHotelRepository;
import com.example.demo.repository.modelo.Hotel;

@Service
public class HotelServiceImpl implements IHotelService {

	@Autowired
	private IHotelRepository hotelRepository;
	
	@Override
	public void guardar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.hotelRepository.insertar(hotel);
	}

	@Override
	public void actulizar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.hotelRepository.actualizar(hotel);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.hotelRepository.eliminar(id);
	}

	@Override
	public Hotel buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.hotelRepository.buscar(id);
	}

	@Override
	public List<Hotel> buscarInnerJoin() {
		// TODO Auto-generated method stub
		return this.hotelRepository.seleccionarInnerJoin();
	}

}
