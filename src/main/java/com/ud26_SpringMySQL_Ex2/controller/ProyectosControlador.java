package com.ud26_SpringMySQL_Ex2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ud26_SpringMySQL_Ex2.dto.Proyectos;
import com.ud26_SpringMySQL_Ex2.service.ProyectosServiceImpl;

@RestController
@RequestMapping("/api")
public class ProyectosControlador {
	
	@Autowired
	ProyectosServiceImpl proyectoServiceImpl;

	@GetMapping("/proyectos")
	public List<Proyectos> listarCproyectos() {
		return proyectoServiceImpl.listarProyectos();
	}

	@PostMapping("/proyectos")
	public Proyectos salvarProyectos(@RequestBody Proyectos Proyectos) {

		return proyectoServiceImpl.guardarProyecto(Proyectos);
	}

	@GetMapping("/proyectos/{id}")
	public Proyectos ProyectosXID(@PathVariable(name = "id") String id) {

		Proyectos proyectos_xid = new Proyectos();

		proyectos_xid = proyectoServiceImpl.proyectoXID(id);

		return proyectos_xid;
	}

	@PutMapping("/proyectos/{id}")
	public Proyectos actualizarProyectos(@PathVariable(name = "id") String id, @RequestBody Proyectos Proyectos) {

		Proyectos p_selec = new Proyectos();
		Proyectos p_act = new Proyectos();

		p_selec = proyectoServiceImpl.proyectoXID(id);

		p_selec.setNombre(Proyectos.getNombre());
		p_selec.setHoras(Proyectos.getHoras());
		p_selec.setAsignadoA(Proyectos.getAsignadoA());

		p_act = proyectoServiceImpl.guardarProyecto(p_selec);

		return p_act;
	}

	@DeleteMapping("/proyectos/{id}")
	public void eliminarProyectos(@PathVariable(name = "id") String id) {
		proyectoServiceImpl.eliminarProyecto(id);
	}
}