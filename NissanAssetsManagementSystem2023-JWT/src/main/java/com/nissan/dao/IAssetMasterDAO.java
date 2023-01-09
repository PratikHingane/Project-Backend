package com.nissan.dao;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.nissan.model.AssetMaster;

@Repository
public interface IAssetMasterDAO extends JpaRepositoryImplementation<AssetMaster, Integer> {

}
