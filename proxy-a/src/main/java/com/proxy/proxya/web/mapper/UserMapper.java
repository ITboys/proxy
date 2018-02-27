package com.proxy.proxya.web.mapper;

import com.proxy.proxya.domain.account.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

	@Insert("INSERT INTO `user`(`name`,`password`,`phone`) VALUES(#{user.name}, #{user.password}, #{user.phone})")
	void insert(@Param("user") User user);

	User findUserByPhone(Long phone);
}
