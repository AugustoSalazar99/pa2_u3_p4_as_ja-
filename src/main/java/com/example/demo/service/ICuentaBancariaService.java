package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.CuentaBancaria;
import com.example.demo.repository.modelo.Propietario;

public interface ICuentaBancariaService {
	
	public CuentaBancaria buscar(Integer id);
	public void actualizar(CuentaBancaria cuentaBancaria);
	public List<CuentaBancaria> reporteCta();
	public CuentaBancaria buscarPorNumero(String numero);
	public void guardar(CuentaBancaria cta);
}