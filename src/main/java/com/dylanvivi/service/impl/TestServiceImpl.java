package com.dylanvivi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dylanvivi.dao.UpUserMapper;
import com.dylanvivi.entity.UpUser;
import com.dylanvivi.entity.UpUserExample;
import com.dylanvivi.service.TestService;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private UpUserMapper mapper;

	@Override
	public List<UpUser> selectUser() {
		UpUserExample example = new UpUserExample();
		example.setOrderByClause("userid desc");
		List<UpUser> list = mapper.selectByExample(example);
		return list;
	}
}
