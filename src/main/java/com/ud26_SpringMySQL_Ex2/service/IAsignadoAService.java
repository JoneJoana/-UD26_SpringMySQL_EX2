package com.ud26_SpringMySQL_Ex2.service;

import java.util.List;

import com.ud26_SpringMySQL_Ex2.dto.AsignadoA;

public interface IAsignadoAService {
	
	// Metodos del CRUD
	public List<AsignadoA> listarAsignadoA(); // GET All

	public AsignadoA guardarAsignadoA(AsignadoA asignadoA); // CREATE UPDATE

	public AsignadoA AsignadoAXID(int id); // READ - GET 1	

	public void eliminarAsignadoA(int id);// DELETE

}
