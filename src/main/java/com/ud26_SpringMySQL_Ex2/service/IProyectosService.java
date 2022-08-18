package com.ud26_SpringMySQL_Ex2.service;

import java.util.List;

import com.ud26_SpringMySQL_Ex2.dto.Proyectos;

public interface IProyectosService {
	// Metodos del CRUD
		public List<Proyectos> listarProyectos(); // GET All

		public Proyectos guardarProyecto(Proyectos proyecto); // CREATE UPDATE

		public Proyectos proyectoXID(String id); // READ GET 1

		public void eliminarProyecto(String id);// DELETE
}
