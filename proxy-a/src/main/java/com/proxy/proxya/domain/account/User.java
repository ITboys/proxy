package com.proxy.proxya.domain.account;

import java.util.Date;

import lombok.Data;
import lombok.Setter;

@Data
public class User {
	
	private Long id;
	
	private String name;
	
	private String password;
	
	private Long phone;
	
	private Integer status;
	
	private Date createTime;
	
	private Date updateTime;
	

}
