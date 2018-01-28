package com.proxy.proxya.web.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.proxy.proxya.domain.account.User;

@Mapper
public interface UserMapper {

	@Insert("INSERT INTO `user`(`name`,`password`,`phone`) VALUES(#{user.name}, #{user.password}, #{user.phone})")
	void insert(@Param("user") User user);

	User findUserByPhone(Long phone);
}
