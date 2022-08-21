package com.ud26_SpringMySQL_Ex2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ud26_SpringMySQL_Ex2.dao.IProyectosDAO;
import com.ud26_SpringMySQL_Ex2.dto.Proyectos;

@Service
public class ProyectosServiceImpl implements IProyectosService{

	@Autowired
	IProyectosDAO iProyectosDAO;
	
	@Override
	public List<Proyectos> listarProyectos() {
		return iProyectosDAO.findAll();
	}

	@Override
	public Proyectos guardarProyecto(Proyectos proyecto) {
		return iProyectosDAO.save(proyecto);
	}

	@Override
	public Proyectos proyectoXID(String id) {
		return iProyectosDAO.findById(id).orElse(null);
	}

	@Override
	public void eliminarProyecto(String id) {
		iProyectosDAO.deleteById(id);
	}

}
