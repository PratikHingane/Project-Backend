package com.nissan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.dao.IPurchaseOrderDAO;
import com.nissan.model.PurchaseOrder;

@Service
public class PurchaseOrderService implements IPurchaseOrderService {

	@Autowired
	IPurchaseOrderDAO purchaseOrderDAO;
	
	@Override
	public List<PurchaseOrder> getAllPurchaseOrder() {
		return purchaseOrderDAO.findAll();
	}

	@Override
	public PurchaseOrder addPurchaseOrder(PurchaseOrder purchaseorder) {
		
		return purchaseOrderDAO.save(purchaseorder);
	}

	@Override
	public PurchaseOrder getByPSId(Integer psId) {
		return purchaseOrderDAO.findById(psId).get();
	}

	@Override
	public PurchaseOrder updatePurchaseOrder(PurchaseOrder purchaseorder) {
		return purchaseOrderDAO.save(purchaseorder);
	}

}
