package com.example.demo.repository.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="materia")
public class Materia {
	
	@GeneratedValue(generator = "seq_materia", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_materia", sequenceName = "seq_materia", allocationSize = 1)

	@Id
	@Column(name = "matri_id")
	private Integer id;
	@Column(name = "matri_nombre")
	private String nombre;
	@Column(name = "matri_codigo")
	private String codigo;
	@Column(name = "matri_curso")
	private String curso;

	
	@OneToMany(mappedBy = "materia")
	private List<Matricula> matriculas;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Semestre semestre;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public List<Matricula> getMatriculas() {
		return matriculas;
	}

	public void setMatriculas(List<Matricula> matriculas) {
		this.matriculas = matriculas;
	}

	public Semestre getSemestre() {
		return semestre;
	}

	public void setSemestre(Semestre semestre) {
		this.semestre = semestre;
	}

	@Override
	public String toString() {
		return "Materia [id=" + id + ", nombre=" + nombre + ", codigo=" + codigo + ", curso=" + curso + ", matriculas="
				+ matriculas + ", semestre=" + semestre + "]";
	}

	

}
