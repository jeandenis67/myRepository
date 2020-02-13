package com.adaming.accueil.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Roles {

	@Id
	private long idRole;
	@Column
	private String roleName;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idUsers")
	private Users user;

	public long getIdRole() {
		return idRole;
	}

	public void setIdRole(long idRole) {
		this.idRole = idRole;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Roles() {
	}

	public Roles(long idRole, String roleName, Users user) {
		this.idRole = idRole;
		this.roleName = roleName;
		this.user = user;
	}

	@Override
	public String toString() {
		return "Roles [idRole=" + idRole + ", roleName=" + roleName + ", user=" + user + "]";
	}

}
