package com.nissan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.common.CheckDuplication;
import com.nissan.common.ValidationException;
import com.nissan.dao.IUserDAO;
import com.nissan.model.User;

@Service
public class UserService implements IUserService  {

	@Autowired
	IUserDAO userDao;
	//@Autowired 
	//CheckDuplication checkDuplicate;
	
	
	@Override
	public User addUser(User user) throws Exception {
		//checking age valid
		/*if(Integer.parseInt(user.getAge())<=18) {
			//throwing exception for age validation
			throw new ValidationException("Age should be more than 18");
		}else if(checkDuplicate.checkPhoneNumber(getAllUser(),user.getPhoneNumber())){
			// validation for phoneNumber duplication
			throw new ValidationException("Phone Number is already Exists.."); 
		}*/
		return userDao.save(user);
	}

	@Override
	public User updateUser(User user) throws Exception{
		if(Integer.parseInt(user.getAge())<=18) {
			throw new ValidationException("Age should be more than 18");
		}
		return userDao.save(user);
	}

	@Override
	public void deleteUser(Integer uId) {

		userDao.deleteById(uId);

	}

	@Override
	public List<User> getAllUser() {
		
		return userDao.findAll();
	}

	@Override
	public User getByUserId(Integer uId) {
		User user=null;
		try {
		user= userDao.findById(uId).get();
		}catch(Exception e){
			System.out.println("invalid id");
		}
		return user;
	}

}
