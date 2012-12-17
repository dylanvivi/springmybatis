package com.dylanvivi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dylanvivi.entity.UpUser;

@Service
public interface TestService {

	public List<UpUser> selectUser();
}
