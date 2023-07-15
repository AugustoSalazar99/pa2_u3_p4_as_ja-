package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="estudiante")
public class Empleado {
	@GeneratedValue(generator="seq_empleado",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_empleado",sequenceName = "seq_empleado",allocationSize = 1)
	
	@Id
	@Column(name="est_id")
	private Integer id;
	@Column(name="est_nombre")
	private String nombre;
	@Column(name="est_sueldo")
	private BigDecimal sueldo;
	@Column(name="est_turno")
	private LocalDateTime turno;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="depa_id_est")
	private Departamento departamento;

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

	public BigDecimal getSueldo() {
		return sueldo;
	}

	public void setSueldo(BigDecimal sueldo) {
		this.sueldo = sueldo;
	}

	public LocalDateTime getTurno() {
		return turno;
	}

	public void setTurno(LocalDateTime turno) {
		this.turno = turno;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", sueldo=" + sueldo + ", turno=" + turno
				+ ", departamento=" + departamento + "]";
	}
	
	
	
	

}
