package com.ud26_SpringMySQL_Ex2.service;

import java.util.List;

import com.ud26_SpringMySQL_Ex2.dto.Cientificos;

public interface ICientificosService {
	// Metodos del CRUD
	public List<Cientificos> listarCientificos(); // GET All

	public Cientificos guardarCientifico(Cientificos cientifico); //CREATE UPDATE

	public Cientificos cientificosXID(String dni); // READ GET 1

	public void eliminarCientificos(String dni);// DELETE

}
