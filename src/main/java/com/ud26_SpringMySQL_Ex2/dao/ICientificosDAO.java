package com.ud26_SpringMySQL_Ex2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ud26_SpringMySQL_Ex2.dto.Cientificos;

public interface ICientificosDAO extends JpaRepository<Cientificos, String>{

}
