package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IHotelRepository;
import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.repository.modelo.Hotel;

@Service
public class HotelServiceImpl implements IHotelService {

	@Autowired
	private IHotelRepository hotelRepository;
	

	@Override
	public List<Hotel> buscarInnerJoin() {
		// TODO Auto-generated method stub
		return this.hotelRepository.seleccionarInnerJoin();
	}

	@Override
	public List<Hotel> buscarOuterRightJoin() {
		// TODO Auto-generated method stub
		return this.hotelRepository.seleccionarOuterRightJoin();
	}

	@Override
	public List<Hotel> buscarOuterLeftJoin() {
		// TODO Auto-generated method stub
		return this.hotelRepository.seleccionarOuterLeftJoin();
	}

	@Override
	public List<Habitacion> buscarHabitacionesOuterLeftJoin() {
		// TODO Auto-generated method stub
		return this.hotelRepository.seleccionarHabitacionesOuterLeftJoin();
	}

	@Override
	public List<Habitacion> buscarHabitacionesOuterFulltJoin() {
		// TODO Auto-generated method stub
		return this.hotelRepository.seleccionarHabitacionesOuterFulltJoin();
	}

	@Override
	public List<Hotel> buscarWhereJoin() {
		// TODO Auto-generated method stub
		return this.hotelRepository.seleccionarWhereJoin();
	}

}
