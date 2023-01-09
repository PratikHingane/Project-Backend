package com.nissan.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.Role;
import com.nissan.service.IRoleService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class RoleController {

	@Autowired
	IRoleService roleService;
	
	
	@PostMapping("roles")
	public Role addRole(@RequestBody Role newRole)
	{
		Role role=null;
		try {
			role= roleService.addRole(newRole);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return role;
	}
	
	@PutMapping("roles")
	public Role updateRole(@RequestBody Role newRole)
	{
		Role role=null;
		try {
			role= roleService.updateRole(newRole);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return role;
	}
	
	@DeleteMapping("roles/{_roleId}")
	public void deleteRole(@PathVariable Integer _roleId)
	{
		roleService.deleteRole(_roleId);
	}
	
	@GetMapping("roles")
	public List<Role> getAllRole(){
		return roleService.getAllRole();
	}
	
	@GetMapping("roles/{_roleId}")
	public Role getRoleWithId(@PathVariable Integer _roleId) {
		return roleService.getByRoleId(_roleId);
	}
}
