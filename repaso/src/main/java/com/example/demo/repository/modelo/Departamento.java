package com.example.demo.repository.modelo;

import java.util.List;

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
@Table(name="departamento")
public class Departamento {
	@GeneratedValue(generator="seq_departamento",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_departamento",sequenceName = "seq_departamento",allocationSize = 1)
	
	@Id
	@Column(name="dep_id")
	private Integer id;
	@Column(name="dep_nombre")
	private String nombre;
	
	@OneToMany(mappedBy = "departamento")
	
	private List<Empleado> empleado;

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

	public List<Empleado> getEmpleado() {
		return empleado;
	}

	public void setEmpleado(List<Empleado> empleado) {
		this.empleado = empleado;
	}

	@Override
	public String toString() {
		return "Departamento [id=" + id + ", nombre=" + nombre + ", empleado=" + empleado + "]";
	}
	

}
