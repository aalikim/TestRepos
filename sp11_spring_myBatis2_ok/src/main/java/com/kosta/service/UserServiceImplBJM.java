package com.kosta.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kosta.controller.HomeController;
import com.kosta.dao.UserDAOImpl;
import com.kosta.dao.UserDAOImplBJM;
import com.kosta.dto.UserDTO;

@Service
public class UserServiceImplBJM implements UserService {
	
	@Autowired
	private UserDAOImplBJM dao;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Override
	public List<UserDTO> userList() {
		logger.info("list 액션 입니다.");
		List<UserDTO> List = dao.getUsers();
		return List;
	}

	@Override
	public void insert(UserDTO dto) {
		logger.info("insert 액션 입니다.");
		dao.insertUsers(dto);	
		
	}

	@Override
	public void update(UserDTO dto) {
		logger.info("update 액션 입니다.");
		String pwd = dto.getPassword();
		dao.updateUsers(dto);	
		
	}

	@Override
	public void delete(String id) {
		logger.info("delete 액션 입니다.");
		dao.deleteUsers(id);	
		
	}

}
