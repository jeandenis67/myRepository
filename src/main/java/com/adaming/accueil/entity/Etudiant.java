package com.adaming.accueil.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Etudiant {

	@Id
	private long idEtudiant;
	@Column
	private String nomEtudiant;
	@Column
	private String prenomEtudiant;

	public long getIdEtudiant() {
		return idEtudiant;
	}

	public void setIdEtudiant(long idEtudiant) {
		this.idEtudiant = idEtudiant;
	}

	public String getNomEtudiant() {
		return nomEtudiant;
	}

	public void setNomEtudiant(String nomEtudiant) {
		this.nomEtudiant = nomEtudiant;
	}

	public String getPrenomEtudiant() {
		return prenomEtudiant;
	}

	public void setPrenomEtudiant(String prenomEtudiant) {
		this.prenomEtudiant = prenomEtudiant;
	}

	public Etudiant() {
		super();
	}

	public Etudiant(long idEtudiant, String nomEtudiant, String prenomEtudiant) {
		super();
		this.idEtudiant = idEtudiant;
		this.nomEtudiant = nomEtudiant;
		this.prenomEtudiant = prenomEtudiant;
	}

	@Override
	public String toString() {
		return "Etudiant [idEtudiant=" + idEtudiant + ", nomEtudiant=" + nomEtudiant + ", PrenomEtudiant="
				+ prenomEtudiant + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (idEtudiant ^ (idEtudiant >>> 32));
		result = prime * result + ((nomEtudiant == null) ? 0 : nomEtudiant.hashCode());
		result = prime * result + ((prenomEtudiant == null) ? 0 : prenomEtudiant.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Etudiant other = (Etudiant) obj;
		if (idEtudiant != other.idEtudiant)
			return false;
		if (nomEtudiant == null) {
			if (other.nomEtudiant != null)
				return false;
		} else if (!nomEtudiant.equals(other.nomEtudiant))
			return false;
		if (prenomEtudiant == null) {
			if (other.prenomEtudiant != null)
				return false;
		} else if (!prenomEtudiant.equals(other.prenomEtudiant))
			return false;
		return true;
	}

}
