package com.nissan.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="tbllogin1")
public class Login {
	//Instance variables
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer lId;
	private String username;
	private String password;
	private Integer roleId;
	@JoinColumn(name="roleId",insertable=false,updatable=false)
	@ManyToOne
	private Role role;
	private Boolean isActive;
	//@OneToOne(mappedBy="login",cascade=CascadeType.ALL)
	//private User user;
	
		
	//Getter and Setters
	
	public Integer getlId() {
		return lId;
	}
	public void setlId(Integer lId) {
		this.lId = lId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	/*@JsonBackReference
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}*/
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
	
	
	

}
