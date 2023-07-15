package com.example.demo.repository.modelo;

import java.math.BigDecimal;
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
@Table
public class Paciente {
	
	@GeneratedValue(generator = "seq_paciente",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name="seq_paciente",sequenceName = "seq_paciente",allocationSize = 1)
	
	@Id
	@Column(name="pac_id")
	private Integer id;
	@Column(name="pac_nombre")
	private String nombre;
	@Column(name="pac_sueldo")
	private BigDecimal sueldo;
	
	//relacion
	@OneToMany(mappedBy = "paciente")
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

	public BigDecimal getSueldo() {
		return sueldo;
	}

	public void setSueldo(BigDecimal sueldo) {
		this.sueldo = sueldo;
	}

	public List<Cita> getCitas() {
		return citas;
	}

	public void setCitas(List<Cita> citas) {
		this.citas = citas;
	}

	@Override
	public String toString() {
		return "Paciente [id=" + id + ", nombre=" + nombre + ", sueldo=" + sueldo + ", citas=" + citas + "]";
	}
	
	
	

}
