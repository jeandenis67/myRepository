package com.adaming.accueil.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {

	@Id
	private long idUsers;
	@Column
	private String userName;
	@Column
	private String password;
	@Column
	private boolean activated;
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<Roles> roles = new ArrayList<Roles>();

	public long getIdUsers() {
		return idUsers;
	}

	public void setIdUsers(long idUsers) {
		this.idUsers = idUsers;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActivated() {
		return activated;
	}

	public void setActivated(boolean activated) {
		this.activated = activated;
	}

	public List<Roles> getRoles() {
		return roles;
	}

	public void setRoles(List<Roles> roles) {
		this.roles = roles;
	}

	public Users() {
		super();
	}

	public Users(long idUsers, String userName, String password, boolean activated, List<Roles> roles) {
		super();
		this.idUsers = idUsers;
		this.userName = userName;
		this.password = password;
		this.activated = activated;
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "Users [idUsers=" + idUsers + ", userName=" + userName + ", password=" + password + ", activated="
				+ activated + ", roles=" + roles + "]";
	}

}
