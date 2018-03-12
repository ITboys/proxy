/**
 * @copyright remark holdings
 */
package com.proxy.proxya.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @author kobe_t
 * @date 2018/3/12 9:21
 */
@Slf4j
@Component
public class JedisUtil {

    @Autowired
    private JedisPool jedisPool;


    public Jedis getResource() {
        return jedisPool.getResource();
    }

    public void returnResource(Jedis jedis) {
        if (jedis != null) {
            jedisPool.close();
        }
    }

    public void set(String key, String value) {
        Jedis jedis = null;
        try {
            jedis = getResource();
            jedis.set(key, value);
        } catch (Exception e) {
            log.error("set the key {} to redis failed, the value is {}", key, value, e);
        } finally {
            returnResource(jedis);
        }

    }
}
