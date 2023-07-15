package com.example.demo.repository.modelo;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="doctor")
public class Doctor {

	@GeneratedValue(generator = "seq_doctor",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name="seq_doctor",sequenceName = "seq_doctor",allocationSize = 1)
	
	@Id
	@Column(name="doc_id")
	private Integer id;
	@Column(name="doc_nombre")

	private String nombre;
	@Column(name="doc_cedula")

	private String cedula;
	@Column(name="doc_fechaNacimiento")

	private LocalDateTime fechaNacimiento;
	
	//relacion
	@OneToMany(mappedBy = "doctor")
	private List<Cita> citas;

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

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public List<Cita> getCitas() {
		return citas;
	}

	public void setCitas(List<Cita> citas) {
		this.citas = citas;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", nombre=" + nombre + ", cedula=" + cedula + ", fechaNacimiento=" + fechaNacimiento
				+ ", citas=" + citas + "]";
	}
	
	
	
}
