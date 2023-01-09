package com.nissan.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
@Table(name="tblassetclass")
public class AssetClass {

	//instance variables
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer acId;
	private String acName;
	
	@OneToMany(mappedBy="assetClass",cascade=CascadeType.ALL)
	private List<AssetDefination> assetDef;
	
	//parameterized constr
	public AssetClass(Integer acId, String acName) {
		
		this.acId = acId;
		this.acName = acName;
	}
	
	//default constr .
	public AssetClass() {
		super();
		
	}

	//getters & setters
	public Integer getAcId() {
		return acId;
	}

	public void setAcId(Integer acId) {
		this.acId = acId;
	}

	public String getAcName() {
		return acName;
	}

	public void setAcName(String acName) {
		this.acName = acName;
	}
	
	@JsonManagedReference
	public List<AssetDefination> getAssetDef() {
		return assetDef;
	}

	public void setAssetDef(List<AssetDefination> assetDef) {
		this.assetDef = assetDef;
	}

	//toString Override
	@Override
	public String toString() {
		return "AssetClass [acId=" + acId + ", acName=" + acName + "]";
	}
	
}
