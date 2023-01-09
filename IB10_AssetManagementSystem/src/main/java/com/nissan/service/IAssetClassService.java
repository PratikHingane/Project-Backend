package com.nissan.service;

import java.util.List;

import com.nissan.model.AssetClass;

public interface IAssetClassService {
	
	//get All list
	public List<AssetClass> getAllAssetClassList();

	public AssetClass getAllAssetClassListById(Integer _assetclassesId);

}
