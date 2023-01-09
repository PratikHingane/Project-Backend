package com.nissan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="tblassetdefination")
public class AssetDefination {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer adId;
	private String adName;
	private Integer atId;
	@JoinColumn(name="atId",insertable=false,updatable=false)
	@ManyToOne
	private AssetType assetType;
	private Integer acId;
	@JoinColumn(name="acId",insertable=false,updatable=false)
	@ManyToOne
	private AssetClass assetClass;
	
	//Getter and Setter
	public Integer getAdId() {
		return adId;
	}
	public void setAdId(Integer adId) {
		this.adId = adId;
	}
	public String getAdName() {
		return adName;
	}
	public void setAdName(String adName) {
		this.adName = adName;
	}
	public Integer getAtId() {
		return atId;
	}
	public void setAtId(Integer atId) {
		this.atId = atId;
	}
	@JsonBackReference
	public AssetType getAssetType() {
		return assetType;
	}
	public void setAssetType(AssetType assetType) {
		this.assetType = assetType;
	}
	public Integer getAcId() {
		return acId;
	}
	public void setAcId(Integer acId) {
		this.acId = acId;
	}
	@JsonBackReference
	public AssetClass getAssetClass() {
		return assetClass;
	}
	public void setAssetClass(AssetClass assetClass) {
		this.assetClass = assetClass;
	}
	
}
