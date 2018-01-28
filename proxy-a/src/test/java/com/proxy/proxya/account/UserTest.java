package com.proxy.proxya.account;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.proxy.proxya.ProxyAApplicationTests;
import com.proxy.proxya.domain.account.User;
import com.proxy.proxya.web.mapper.UserMapper;

public class UserTest extends ProxyAApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void test() {
		User user = new User();
		user.setName("testUser");
		user.setPassword("xxx");
		user.setPhone(13698418308L);
		userMapper.insert(user);
	}

}
