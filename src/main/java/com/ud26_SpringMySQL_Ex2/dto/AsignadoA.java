package com.ud26_SpringMySQL_Ex2.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "asignadoA")
public class AsignadoA {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
    @JoinColumn(name = "cientifico")
    Cientificos cientifico;
 
    @ManyToOne
    @JoinColumn(name = "proyecto")
    Proyectos proyecto;
    
    public AsignadoA() {}

	public AsignadoA(int id, Cientificos cientifico, Proyectos proyecto) {
		this.id = id;
		this.cientifico = cientifico;
		this.proyecto = proyecto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cientificos getCientifico() {
		return cientifico;
	}

	public void setCientifico(Cientificos cientifico) {
		this.cientifico = cientifico;
	}

	public Proyectos getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyectos proyecto) {
		this.proyecto = proyecto;
	}

	@Override
	public String toString() {
		return "Asignado_A [id=" + id + ", cientifico=" + cientifico + ", proyecto=" + proyecto + "]";
	}

}
