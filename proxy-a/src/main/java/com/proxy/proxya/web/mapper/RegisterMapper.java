package com.proxy.proxya.web.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.proxy.proxya.domain.account.Register;

@Mapper
public interface RegisterMapper {

	@Insert("INSERT INTO `register`(`name`,`msg_code`,`phone`) VALUES(#{register.name},"
			+ "#{register.msgCode},#{register.phone})")
	Integer register(@Param("register") Register register);

}
