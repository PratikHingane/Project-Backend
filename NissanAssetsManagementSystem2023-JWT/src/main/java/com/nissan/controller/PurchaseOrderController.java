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

import com.nissan.model.PurchaseOrder;
import com.nissan.service.IPurchaseOrderService;

@CrossOrigin
@RestController
@RequestMapping("api/")
public class PurchaseOrderController {
	
	@Autowired
	IPurchaseOrderService purchaseorderService;
	
	//Get All List of Purchase Order
	@GetMapping("purchaseorders")
	public List<PurchaseOrder> getAllPurchaseOrderList() {
		return purchaseorderService.getAllPurchaseOrder();
	}
	
	//Get By Purchase Order Id
	@GetMapping("purchaseorders/{_poId}")
	public PurchaseOrder getByPOId(@PathVariable Integer _poId) {
		return purchaseorderService.getByPSId(_poId);
	}
	
	//Add Purchase Order
	@PostMapping("purchaseorders")
	public PurchaseOrder addPurchaseOrder(@RequestBody PurchaseOrder purchaseorder) {
		return purchaseorderService.addPurchaseOrder(purchaseorder);
	}
	
	//Edit Purchase Order
	@PutMapping("purchaseorders")
	public PurchaseOrder updatePurchaseOrder(@RequestBody PurchaseOrder purchaseorder) {
		return purchaseorderService.updatePurchaseOrder(purchaseorder);
	}
	

}
