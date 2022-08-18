package com.ud26_SpringMySQL_Ex2.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "cientificos")
public class Cientificos {
	
	@Id
	private String dni;
	private String nomApels;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cientifico")
    private List<AsignadoA> asignadoA;
	
	
	public Cientificos() {}
	
	public Cientificos(String dni, String nomApels, List<AsignadoA> asignadoA) {
		this.dni = dni;
		this.nomApels = nomApels;
		this.asignadoA = asignadoA;
	}

	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getNomApels() {
		return nomApels;
	}


	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
	}

	public List<AsignadoA> getAsignadoA() {
		return asignadoA;
	}

	public void setAsignadoA(List<AsignadoA> asignadoA) {
		this.asignadoA = asignadoA;
	}

	@Override
	public String toString() {
		return "Cientifico [dni=" + dni + ", nomApels=" + nomApels + "]";
	}
	
	
}
