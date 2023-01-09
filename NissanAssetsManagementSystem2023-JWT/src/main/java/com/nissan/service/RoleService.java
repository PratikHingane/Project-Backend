package com.nissan.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.dao.IRoleDAO;
import com.nissan.model.Role;
import com.nissan.model.User;

@Service
public class RoleService implements IRoleService {

	@Autowired
	IRoleDAO roleDao;

	@Override
	public List<Role> getAllRole() {
		return roleDao.findAll();
	}

	@Override
	public Role addRole(Role role) throws Exception {

		return roleDao.save(role);
	}

	@Override
	public Role updateRole(Role role) throws Exception {

		return roleDao.save(role);
	}

	@Override
	public void deleteRole(Integer roleId) {
		roleDao.deleteById(roleId);
	}

	@Override
	public Role getByRoleId(Integer roleId) {
		Role role=null;
		try {
			role= roleDao.findById(roleId).get();
		}catch(Exception e){
			System.out.println("invalid id");
		}
		return role;
	}

}
