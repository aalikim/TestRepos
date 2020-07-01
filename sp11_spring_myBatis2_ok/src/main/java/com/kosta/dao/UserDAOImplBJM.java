package com.kosta.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kosta.dto.UserDTO;
import com.kosta.mapper.UserMapper;

@Repository
public class UserDAOImplBJM implements UserDAO {
	
	@Autowired
	private SqlSession  sqlSession;

	@Override
	public ArrayList<UserDTO> getUsers() {
		ArrayList<UserDTO> lists = new ArrayList<UserDTO>();
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		
		lists = mapper.getUsers();
		
		return lists;
	}

	@Override
	public void insertUsers(UserDTO dto) {
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		mapper.insertUsers(dto);
	}

	@Override
	public void updateUsers(UserDTO dto) {
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		mapper.updateUsers(dto);

	}

	@Override
	public void deleteUsers(String id) {
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		mapper.deleteUsers(id);
	}

}
