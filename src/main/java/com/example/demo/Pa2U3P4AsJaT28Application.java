package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.Materia;
import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.Provincia;
import com.example.demo.repository.modelo.Semestre;
import com.example.demo.service.IEstudianteService;
import com.example.demo.service.IMateriaService;
import com.example.demo.service.IMatriculaService;

@SpringBootApplication
public class Pa2U3P4AsJaT28Application implements CommandLineRunner{
	@Autowired
	private IEstudianteService estudianteService;
	@Autowired
	private IMatriculaService matriculaService;
	@Autowired
	private IMateriaService materiaService;
	public static void main(String[] args) {
		SpringApplication.run(Pa2U3P4AsJaT28Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// creacion de provincia
		Provincia pro = new Provincia();
		pro.setNombre("manabi");
		pro.setCanton("Portoviejo");
		pro.setNumeroProvincia("13");

		// creacion de estudiante

		Estudiante estu = new Estudiante();
		estu.setCedula("1723456890");
		estu.setNombre("Emiliano");
		estu.setTelefono("0987654321");
		List<Estudiante> listaEstudiantes = new ArrayList<>();
		listaEstudiantes.add(estu);

		// creacion de semestre

		Semestre se = new Semestre();
		se.setFecha(LocalDateTime.now());
		se.setCosto(new BigDecimal(302));
		se.setPeriodo("2023");

		// creacion de materia

		Materia ma = new Materia();
		ma.setCodigo("564");
		ma.setNombre("programacion lll");
		ma.setCurso("R74");
		
		Materia ma1 = new Materia();
		ma1.setCodigo("2312");
		ma1.setNombre("programacion 4");
		ma1.setCurso("R4");

		List<Materia> listaMaterias = new ArrayList<>();
		listaMaterias.add(ma);
		listaMaterias.add(ma1);
		
		List<String> listaM = new ArrayList<>();
		listaM.add(ma.getCodigo());
		listaM.add(ma1.getCodigo());
		
		// creacion de matricula

		Matricula matri = new Matricula();
		matri.setFecha(LocalDateTime.now());
		matri.setInstitucion("COTAESG");
		matri.setNumero("8796");
		
		List<Matricula> listaMatricula = new ArrayList<>();
		listaMatricula.add(matri);
		
		
		
		
		// union de tablas
		pro.setEstudiantes(listaEstudiantes);
		estu.setProvincia(pro);
		
		se.setMateria(listaMaterias);
		ma.setSemestre(se);
	
		
		estu.setMatriculas(listaMatricula);
		matri.setEstudiante(estu);
		
		ma.setMatriculas(listaMatricula);
		matri.setMateria(ma);
		
		
		
		
		
		//this.matriculaService.guardar(matri);

		/*
		 * List<Hotel> listaHotel = this.hotelService.buscarWhereJoin(); for (Hotel h :
		 * listaHotel) { if (h == null) {
		 * System.out.println("No existe este hotel aun"); } else {
		 * System.out.println(h.getId() +" Direccion: "+
		 * h.getDireccion()+" ,Nombre: "+h.getNombre()); } }
		 */	
		
		
		this.matriculaService.matricular(estu.getCedula(),listaM);
	}

}
