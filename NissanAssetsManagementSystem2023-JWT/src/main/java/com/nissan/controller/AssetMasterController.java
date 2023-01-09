package com.nissan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.AssetMaster;
import com.nissan.service.IAssetMasterService;

@CrossOrigin
@RestController
@RequestMapping("api/")
public class AssetMasterController {
	
	@Autowired
	IAssetMasterService assetmasterService;
	
	//get All List of Asset Master
	@GetMapping("assetmasters")
	public List<AssetMaster> getAllAssetMaster(){
		return assetmasterService.getAllAssetMaster();
	}
	
	//get By Id
	@GetMapping("assetmasters/{_asId}")
	public AssetMaster getByAsId(@PathVariable Integer _asId) {
		return assetmasterService.getByAssetMasterId(_asId);
	}
	
	//add AssetMaster
	@PostMapping("assetmasters")
	public AssetMaster addAssetMaster(@RequestBody AssetMaster assetmaster) {
		return assetmasterService.addAssetMaster(assetmaster);
	}
	
	//update AssetMaster
	@PutMapping("assetmasters")
	public AssetMaster updateAssetMaster(@RequestBody AssetMaster assetmaster) {
		return assetmasterService.updateAssetMaster(assetmaster);
	}

}
