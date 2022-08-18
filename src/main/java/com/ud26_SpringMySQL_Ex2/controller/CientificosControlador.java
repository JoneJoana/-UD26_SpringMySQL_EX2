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

import com.ud26_SpringMySQL_Ex2.dto.Cientificos;
import com.ud26_SpringMySQL_Ex2.service.CientificosServiceImpl;

@RestController
@RequestMapping("/api")
public class CientificosControlador {
	@Autowired
	CientificosServiceImpl cientificosServiceImpl;
	
	@GetMapping("/cientificos")
	public List<Cientificos> listarCientificos(){
		return cientificosServiceImpl.listarCientificos();
	}
	
	@GetMapping("/cientificos/{dni}")
	public Cientificos cientificoXID(@PathVariable(name="dni") String dni) {
		
		Cientificos cientifico= new Cientificos();
		
		cientifico=cientificosServiceImpl.cientificosXID(dni);
		
		return cientifico;
	}
	
	@PostMapping("/cientificos")
	public Cientificos salvarCientifico(@RequestBody Cientificos cientifico) {
		return cientificosServiceImpl.guardarCientifico(cientifico);
	}
	
	@PutMapping("/cientificos/{dni}")
	public Cientificos actualizarCientificos(@PathVariable(name="dni")String dni,@RequestBody Cientificos cientifico) {
		
		Cientificos cient_selec= new Cientificos();
		Cientificos cient_act= new Cientificos();
		
		cient_selec= cientificosServiceImpl.cientificosXID(dni);
		
		cient_selec.setNomApels(cientifico.getNomApels());
		cient_selec.setAsignadoA(cientifico.getAsignadoA());
		
		cient_act = cientificosServiceImpl.guardarCientifico(cient_selec);
		
		return cient_act;
	}
	
	@DeleteMapping("/cientificos/{dni}")
	public void eleiminarCientifico(@PathVariable(name="dni")String dni) {
		cientificosServiceImpl.eliminarCientificos(dni);
	}
	
}
