package com.proxy.proxya.web.service;

import redis.clients.jedis.Jedis;

/**
 * @author kobe_t
 * @date 2018/3/15 9:33
 */
public interface IRedisService {

    public Jedis getResource();

    public void returnResource(Jedis jedis);

    public void set(String key, String value);

    public String get(String key);

}
