package com.dylanvivi.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dylanvivi.entity.UpUser;
import com.dylanvivi.service.TestService;

@Controller
public class TestController extends BaseController {

	@Autowired
	private TestService service;

	@RequestMapping("test")
	public void test() {
		List<UpUser> list = service.selectUser();
		for (UpUser user : list) {
			System.out.println("user:" + user.getName());
		}
	}
}
