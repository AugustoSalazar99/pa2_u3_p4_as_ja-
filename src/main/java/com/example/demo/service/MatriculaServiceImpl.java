package com.example.demo.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IEstudianteRepository;
import com.example.demo.repository.IMateriaRepository;
import com.example.demo.repository.IMatriculaRepository;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.Materia;
import com.example.demo.repository.modelo.Matricula;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMatriculaRepository matriculaRepository;
	@Autowired
	private IEstudianteRepository estudianteRepository;
	@Autowired
	private IMateriaRepository materiaRepository;

	@Override
	public void guardar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.matriculaRepository.insertar(matricula);
	}

	@Override
	public void actualizar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.matriculaRepository.actualizar(matricula);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.matriculaRepository.eliminar(id);
	}

	@Override
	public Matricula buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.matriculaRepository.buscar(id);
	}

	@Override
	public void matricular(String cedulaEstudiante, List<String> codigoMaterias) {
		Estudiante e = new Estudiante();
		
		
		for (String codigo : codigoMaterias) {
            Materia materia= this.materiaRepository.buscarCodigo(codigo);
            Matricula matricula = new Matricula();
            matricula.setInstitucion("aloja");;
            matricula.setNumero("100");
            matricula.setFecha(LocalDateTime.now());
            matricula.setEstudiante(e);
            matricula.setMateria(materia);
            
            this.matriculaRepository.insertar(matricula);;

 

          }

 

         System.out.println("Se Genero la Matricula"); 
			
		}
		

	}


