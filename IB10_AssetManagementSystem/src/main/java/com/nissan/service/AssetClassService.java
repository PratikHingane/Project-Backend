package com.nissan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.dao.IAssetClassDAO;
import com.nissan.model.AssetClass;

@Service
public class AssetClassService implements IAssetClassService {

	@Autowired
	IAssetClassDAO assetClassDAO;
	
	@Override
	public List<AssetClass> getAllAssetClassList() {
		
		return assetClassDAO.findAll();
	}

	@Override
	public AssetClass getAllAssetClassListById(Integer _assetclassesId) {
		
		return assetClassDAO.findById(_assetclassesId).get();
	}
	
}
