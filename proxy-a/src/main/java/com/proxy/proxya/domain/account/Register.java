package com.proxy.proxya.domain.account;

import java.util.Date;

import lombok.Data;

@Data
public class Register {
	
	private Long id;
	
	private String name;
	
	private Integer msgCode;
	
	private Integer msgCount;
	
	private Long phone;
	
	private Integer status;
	
	private Date createTime;
	
	private Date updateTime;	

}
