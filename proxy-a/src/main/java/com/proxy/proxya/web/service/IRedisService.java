package com.proxy.proxya.web.service;

import redis.clients.jedis.Jedis;

/**
 * @author kobe_t
 * @date 2018/3/15 9:33
 */
public interface IRedisService {

	Jedis getResource();

	void returnResource(Jedis jedis);

	void set(String key, String value);

	String get(String key);

}
