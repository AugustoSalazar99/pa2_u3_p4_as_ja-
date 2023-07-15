package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Departamento;
import com.example.demo.repository.modelo.Doctor;
import com.example.demo.repository.modelo.Cita;
import com.example.demo.repository.modelo.Empleado;
import com.example.demo.repository.modelo.Paciente;
import com.example.demo.service.ICitaService;
import com.example.demo.service.IDoctorService;
import com.example.demo.service.IEmpleadoService;

@SpringBootApplication
public class RepasoApplication implements CommandLineRunner {

	@Autowired
	private IEmpleadoService empleadoService;
	
	@Autowired
	private ICitaService citaService;
	@Autowired
	private IDoctorService doctorService;
	public static void main(String[] args) {
		SpringApplication.run(RepasoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*
		Empleado emp = new Empleado();
		emp.setNombre("Cristina");
		emp.setSueldo(new BigDecimal(200));
		emp.setTurno(LocalDateTime.now());
		
		Departamento depa=new Departamento();
		depa.setNombre("tic");
		List<Empleado>listE = new ArrayList<>();
		listE.add(emp);
		//rel depa /empl
		emp.setDepartamento(depa);
		
		depa.setEmpleado(listE);
		
		this.empleadoService.guardar(emp);
		*/
		
		/*
		Doctor doc = new Doctor();
		doc.setNombre("Pedro");
		doc.setCedula("1234453");
		doc.setFechaNacimiento(LocalDateTime.now());
		
		
		Cita cit = new Cita();
		cit.setCostoCita(new BigDecimal(10));
		cit.setNumeroCita(923);
		
		Paciente pac = new Paciente();
		pac.setNombre("Juan");
		pac.setSueldo(new BigDecimal(12));
		
		List<Paciente> listP = new ArrayList<>();
		listP.add(pac);
		List<Doctor> listD = new ArrayList<>();
		listD.add(doc);
		cit.setPaciente(pac);
		cit.setDoctor(doc);
		
		this.citaService.guardar(cit);
		*/
		
		Doctor doc=this.doctorService.reporte(1, "Pedro");
		System.out.println(""+doc.getNombre()+""+doc.getId());
		
	}
	}