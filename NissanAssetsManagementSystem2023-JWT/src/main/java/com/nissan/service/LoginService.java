package com.nissan.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.common.APIResponse;
import com.nissan.dao.ILoginDAO;
import com.nissan.dao.IUserDAO;
import com.nissan.model.Login;
import com.nissan.model.User;
import com.nissan.utils.JwtUtils;

@Service
public class LoginService implements ILoginService {

	@Autowired
	ILoginDAO logindao;
	
	@Autowired
	IUserDAO userDao;
	
	@Autowired
	JwtUtils jwtUtils;
	
	
	@Override
	public Login addLogin(Login login) {
		
		return logindao.save(login);
	}

	@Override
	public Login updatelogin(Login login) {
		
		return logindao.save(login);
	}

	@Override
	public void deleteLogin(Integer id) {
		
		logindao.deleteById(id);

	}

	@Override
	public List<Login> getAllLogin() {
		
		return logindao.findAll();
	}

	@Override
	public Login getByLoginId(Integer lId) {
		return logindao.findById(lId).get();
	}

	@Override
	public APIResponse login(String username, String password) {
		APIResponse apiResponse=new APIResponse();
		
		Login login=logindao.loginCheck(username, password);
		User user=userDao.getUser(login.getlId());
		
		//response
				if(user==null)
				{
					apiResponse.setData("User login failed");
					return apiResponse;
				}
				
				//generate Token
				String token=jwtUtils.generateJwt(user);
				
				//storing more details
				Map<String,Object> data =new HashMap<>();
				data.put("accessToken", token);
				data.put("role", user.getLogin().getRoleId());
				data.put("firstName", user.getFirstName());
				
				apiResponse.setData(data);
				
				return apiResponse;
	}

}
