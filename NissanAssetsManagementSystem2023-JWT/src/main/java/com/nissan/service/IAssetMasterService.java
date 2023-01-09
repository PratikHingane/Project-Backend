package com.nissan.service;

import java.util.List;

import com.nissan.model.AssetMaster;

public interface IAssetMasterService {
	
	//Get All AssetMaster List
	public List<AssetMaster> getAllAssetMaster();
	
	
	//Get By Id AssetMaster
	public AssetMaster getByAssetMasterId(Integer id);
	
	//Add AssetMaster
	public AssetMaster addAssetMaster(AssetMaster assetmaster);
	
	//edit AssetMaster
	public AssetMaster updateAssetMaster(AssetMaster assetmaster);

}
