package com.nissan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.AssetClass;
import com.nissan.service.IAssetClassService;

@CrossOrigin
@RestController
@RequestMapping("api/")
public class AssetClassController {
	
	@Autowired
	IAssetClassService assetClassService;
	
	@GetMapping("assetclasses")
	public List<AssetClass> getAllAssetClass(){
		return assetClassService.getAllAssetClassList();
	}

}
