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

import com.ud26_SpringMySQL_Ex2.dto.AsignadoA;
import com.ud26_SpringMySQL_Ex2.service.AsignadoAServiceImpl;

@RestController
@RequestMapping("/api")
public class AsignadoAControlador{
	
	@Autowired
	AsignadoAServiceImpl asignadoAServiceImpl;
	
	@GetMapping("/asignadoA")
	public List<AsignadoA> listarAsignadoA(){
		return asignadoAServiceImpl.listarAsignadoA();
	}
	
	
	@PostMapping("/asignadoA")
	public AsignadoA guardarAsignadoA(@RequestBody AsignadoA AsignadoA) {
		return asignadoAServiceImpl.guardarAsignadoA(AsignadoA);
	}
	
	
	@GetMapping("/asignadoA/{id}")
	public AsignadoA asignadoAXID(@PathVariable(name="id") int id) {
		
		AsignadoA AsignadoAxid= new AsignadoA();
		
		AsignadoAxid=asignadoAServiceImpl.AsignadoAXID(id);
		
		return AsignadoAxid;
	}
	
	@PutMapping("/asignadoA/{id}")
	public AsignadoA actualizarAsignadoA(@PathVariable(name="id")int id,@RequestBody AsignadoA AsignadoA) {
		
		AsignadoA Asig_selec= new AsignadoA();
		AsignadoA Asig_act= new AsignadoA();
		
		Asig_selec= asignadoAServiceImpl.AsignadoAXID(id);
		
		
		Asig_selec.setCientifico(AsignadoA.getCientifico());
		Asig_selec.setProyecto(AsignadoA.getProyecto());
		
		Asig_act = asignadoAServiceImpl.guardarAsignadoA(Asig_selec);
		
		return Asig_act;
	}
	
	@DeleteMapping("/asignadoA/{id}")
	public void eliminarAsignadoA(@PathVariable(name="id")int id) {
		asignadoAServiceImpl.eliminarAsignadoA(id);
	}
}
