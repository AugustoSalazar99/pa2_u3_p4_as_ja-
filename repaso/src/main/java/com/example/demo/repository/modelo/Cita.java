package com.example.demo.repository.modelo;

import java.math.BigDecimal;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table

@NamedQuery(name = "Cita.buscarCita",query="SELECT c FROM Cita c WHERE c.id=:datoId AND c.nombre=:datoNombre ")
public class Cita {
	
	@GeneratedValue(generator = "seq_cita",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name="seq_cita",sequenceName = "seq_cita",allocationSize = 1)
	
	@Id
	@Column(name="cit_id")
	private Integer id;
	@Column(name="cit_numeroCita")

	private Integer numeroCita;
	@Column(name="cit_costoCita")

	private BigDecimal costoCita;
	
	//rel doc/cita
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="cita_id_doctor")
	private Doctor doctor;
	
	
	//rel pac/cita
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="cita_id_paciente")
	private Paciente paciente;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getNumeroCita() {
		return numeroCita;
	}


	public void setNumeroCita(Integer numeroCita) {
		this.numeroCita = numeroCita;
	}


	public BigDecimal getCostoCita() {
		return costoCita;
	}


	public void setCostoCita(BigDecimal costoCita) {
		this.costoCita = costoCita;
	}


	public Doctor getDoctor() {
		return doctor;
	}


	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}


	public Paciente getPaciente() {
		return paciente;
	}


	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}


	@Override
	public String toString() {
		return "Cita [id=" + id + ", numeroCita=" + numeroCita + ", costoCita=" + costoCita + ", doctor=" + doctor
				+ ", paciente=" + paciente + "]";
	}
	
	
	

}
