package com.nissan.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;
import com.nissan.model.Login;
@Repository
public interface ILoginDAO extends JpaRepositoryImplementation<Login, Integer> {
	
	@Query("from Login where username=?1 and password=?2")
	public Login loginCheck(String username,String password);

}
