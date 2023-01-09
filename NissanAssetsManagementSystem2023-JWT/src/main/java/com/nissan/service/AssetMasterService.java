package com.nissan.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nissan.dao.IAssetMasterDAO;
import com.nissan.model.AssetMaster;

@Service
public class AssetMasterService implements IAssetMasterService {

	@Autowired
	IAssetMasterDAO assetmasterDao;
	@Override
	public List<AssetMaster> getAllAssetMaster() {
		
		return assetmasterDao.findAll();
	}

	@Override
	public AssetMaster getByAssetMasterId(Integer id) {
		
		return assetmasterDao.findById(id).get();
	}

	@Override
	public AssetMaster addAssetMaster(AssetMaster assetmaster) {
		
		return assetmasterDao.save(assetmaster);
	}

	@Override
	public AssetMaster updateAssetMaster(AssetMaster assetmaster) {
		
		return assetmasterDao.save(assetmaster);
	}

}
