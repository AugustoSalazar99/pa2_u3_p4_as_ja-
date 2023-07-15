package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.repository.modelo.Hotel;
import com.example.demo.service.EstudianteService;
import com.example.demo.service.FabricanteService;
import com.example.demo.service.HabitacionService;
import com.example.demo.service.HotelService;
import com.example.demo.service.MatriculaService;
import com.example.demo.service.ProductoService;


@SpringBootApplication
public class Pa2U2P4AsJaApplication implements CommandLineRunner {

	@Autowired
	private FabricanteService fabricanteService;
	@Autowired
	private ProductoService productoService;
	@Autowired
	private EstudianteService estudianteService;
	@Autowired
	private MatriculaService matriculaService;
	@Autowired
	private HotelService hotelService;
	@Autowired
	private HabitacionService habitacionService;
	
	
	

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AsJaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
	// this.estudianteService.reporteTodosDTO();
		
		Hotel h=new Hotel();
		h.setNombre("hotel gasca");
		h.setDireccion("av.gasca");
		
		
		Habitacion hab = new Habitacion();
		hab.setNumero("G1");
		hab.setValor(new BigDecimal(1000));
		
		List<Habitacion> listhab=new ArrayList<>();
		listhab.add(hab);
		
		h.setHabitaciones(listhab);
		hab.setHotel(h);
		
		
		
	    //this.hotelService.guardar(h);
		
	  /*
		Hotel hot = this.hotelService.buscar(7);
		System.out.println(hot.getNombre()+hot.getId()+hot.getDireccion());
	 */
	   
	    this.habitacionService.reporteTodo();
	
	
		
	
	}

}