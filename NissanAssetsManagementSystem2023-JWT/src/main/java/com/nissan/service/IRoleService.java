package com.nissan.service;

import java.util.List;
import java.util.Optional;

import com.nissan.model.Role;

public interface IRoleService {
		//getAll Role
		public List<Role> getAllRole();
		
		//Save Role
		public Role addRole (Role role) throws Exception;
		
		//update role
		public Role updateRole(Role role) throws Exception;
		
		//Delete role
		public void deleteRole(Integer roleId);
		
		//get role by id
		public Role getByRoleId(Integer roleId);

}
