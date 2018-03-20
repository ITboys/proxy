package com.proxy.proxya.web.mapper;

import com.proxy.proxya.domain.account.User;
import com.proxy.proxya.domain.request.LoginRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    User selectByPrimaryKey(Long id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);

    /**
     * 根据用户名密码查找用户
     *
     * @return
     */
    User findByNameAndPasswd(LoginRequest request);
}