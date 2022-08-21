package com.ud26_SpringMySQL_Ex2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ud26_SpringMySQL_Ex2.dao.ICientificosDAO;
import com.ud26_SpringMySQL_Ex2.dto.Cientificos;

@Service
public class CientificosServiceImpl implements ICientificosService{
	
	@Autowired
	ICientificosDAO iCientificoDAO;

	@Override
	public List<Cientificos> listarCientificos() {
		return iCientificoDAO.findAll();
	}

	@Override
	public Cientificos guardarCientifico(Cientificos cientifico) {
		return iCientificoDAO.save(cientifico);
	}

	@Override
	public Cientificos cientificosXID(String dni) {
		return iCientificoDAO.findById(dni).orElse(null);
	}

	@Override
	public void eliminarCientificos(String dni) {
		iCientificoDAO.deleteById(dni);
	}

}
