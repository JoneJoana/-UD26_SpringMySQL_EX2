package com.ud26_SpringMySQL_Ex2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ud26_SpringMySQL_Ex2.dao.IAsignadoADAO;
import com.ud26_SpringMySQL_Ex2.dto.AsignadoA;

@Service
public class AsignadoAServiceImpl implements IAsignadoAService {

	@Autowired
	IAsignadoADAO iAsignadoADAO;
	
	@Override
	public List<AsignadoA> listarAsignadoA() {
		return iAsignadoADAO.findAll();
	}

	@Override
	public AsignadoA guardarAsignadoA(AsignadoA asignadoA) {
		return iAsignadoADAO.save(asignadoA);
	}

	@Override
	public AsignadoA AsignadoAXID(int id) {
		return iAsignadoADAO.findById(id).get();
	}

	@Override
	public void eliminarAsignadoA(int id) {
		iAsignadoADAO.deleteById(id);
	}

}
