package com.nissan.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tblassetmaster")
public class AssetMaster {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer amId;
	private Integer adId;
	@JoinColumn(name="adId",insertable=false,updatable=false)
	@ManyToOne
	private AssetDefination assetdef;
	private Integer atId;
	@JoinColumn(name="atId",insertable=false,updatable=false)
	@ManyToOne
	private AssetType assettype;
	private Integer vdId;
	@JoinColumn(name="vdId",insertable=false,updatable=false)
	@ManyToOne
	private Vendor vendor;
	private String amModel;
	private String amSnumber;
	private LocalDate pDate;
	private Integer warranty;
	private LocalDate amFrom;
	private LocalDate amTo;
	
	public AssetMaster() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AssetMaster(Integer amId, Integer adId, AssetDefination assetdef, Integer atId, Integer vdId, Vendor vendor,
			AssetType assettype, String amModel, String amSnumber, LocalDate pDate, Integer warranty, LocalDate amFrom,
			LocalDate amTo) {
		super();
		this.amId = amId;
		this.adId = adId;
		this.assetdef = assetdef;
		this.atId = atId;
		this.vdId = vdId;
		this.vendor = vendor;
		this.assettype = assettype;
		this.amModel = amModel;
		this.amSnumber = amSnumber;
		this.pDate = pDate;
		this.warranty = warranty;
		this.amFrom = amFrom;
		this.amTo = amTo;
	}

	public Integer getAmId() {
		return amId;
	}

	public void setAmId(Integer amId) {
		this.amId = amId;
	}

	public Integer getAdId() {
		return adId;
	}

	public void setAdId(Integer adId) {
		this.adId = adId;
	}

	public AssetDefination getAssetdef() {
		return assetdef;
	}

	public void setAssetdef(AssetDefination assetdef) {
		this.assetdef = assetdef;
	}

	public Integer getAtId() {
		return atId;
	}

	public void setAtId(Integer atId) {
		this.atId = atId;
	}

	public Integer getVdId() {
		return vdId;
	}

	public void setVdId(Integer vdId) {
		this.vdId = vdId;
	}

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	public AssetType getAssettype() {
		return assettype;
	}

	public void setAssettype(AssetType assettype) {
		this.assettype = assettype;
	}

	public String getAmModel() {
		return amModel;
	}

	public void setAmModel(String amModel) {
		this.amModel = amModel;
	}

	public String getAmSnumber() {
		return amSnumber;
	}

	public void setAmSnumber(String amSnumber) {
		this.amSnumber = amSnumber;
	}

	public LocalDate getpDate() {
		return pDate;
	}

	public void setpDate(LocalDate pDate) {
		this.pDate = pDate;
	}

	public Integer getWarranty() {
		return warranty;
	}

	public void setWarranty(Integer warranty) {
		this.warranty = warranty;
	}

	public LocalDate getAmFrom() {
		return amFrom;
	}

	public void setAmFrom(LocalDate amFrom) {
		this.amFrom = amFrom;
	}

	public LocalDate getAmTo() {
		return amTo;
	}

	public void setAmTo(LocalDate amTo) {
		this.amTo = amTo;
	}

	@Override
	public String toString() {
		return "AssetMaster [amId=" + amId + ", adId=" + adId + ", assetdef=" + assetdef + ", atId=" + atId + ", vdId="
				+ vdId + ", vendor=" + vendor + ", assettype=" + assettype + ", amModel=" + amModel + ", amSnumber="
				+ amSnumber + ", pDate=" + pDate + ", warranty=" + warranty + ", amFrom=" + amFrom + ", amTo=" + amTo
				+ "]";
	}
	
	
	

}
