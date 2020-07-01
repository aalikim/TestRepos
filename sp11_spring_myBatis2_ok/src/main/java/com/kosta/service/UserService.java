package com.kosta.service;

import java.util.List;

import com.kosta.dto.UserDTO;

public interface UserService {
	public List<UserDTO> userList();
	public void insert(UserDTO dto);
	public void update(UserDTO dto);
	public void delete(String id);
}
