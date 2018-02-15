package com.proxy.proxya.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Pay {
	
	private BigDecimal price;

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	

}
