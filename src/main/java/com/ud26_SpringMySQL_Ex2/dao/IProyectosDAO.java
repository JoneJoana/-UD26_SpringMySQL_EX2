package com.ud26_SpringMySQL_Ex2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ud26_SpringMySQL_Ex2.dto.Proyectos;

public interface IProyectosDAO extends JpaRepository<Proyectos, String>{

}
