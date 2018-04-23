package com.proxy.proxya.account;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.proxy.proxya.domain.account.User;
import com.proxy.proxya.web.mapper.UserMapper;

//@Transactional
public class UserTest {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void test() {
		User user = new User();
		user.setUserName("testUser");
		user.setPassword("xxx");
		user.setPhone(13698418308L);
		userMapper.insert(user);
	}
	
	@Test
	public void findUser() {
		System.out.println("=======================start===================");
		try{
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
