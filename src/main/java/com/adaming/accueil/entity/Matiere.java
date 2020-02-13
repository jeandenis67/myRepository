package com.adaming.accueil.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Matiere {

	@Id
	private long idMatiere;
	@Column
	private String nomMatiere;

	public long getIdMatiere() {
		return idMatiere;
	}

	public void setIdMatiere(long idMatiere) {
		this.idMatiere = idMatiere;
	}

	public String getNomMatiere() {
		return nomMatiere;
	}

	public void setNomMatiere(String nomMatiere) {
		this.nomMatiere = nomMatiere;
	}

	public Matiere() {
	}

	public Matiere(long idMatiere, String nomMatiere) {
		this.idMatiere = idMatiere;
		this.nomMatiere = nomMatiere;
	}

	@Override
	public String toString() {
		return "Matiere [idMatiere=" + idMatiere + ", nomMatiere=" + nomMatiere + "]";
	}

}
