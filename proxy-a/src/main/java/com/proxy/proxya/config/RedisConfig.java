/**
 * @copyright remark holdings
 */
package com.proxy.proxya.config;

import lombok.Data;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @author kobe_t
 * @date 2018/2/28 9:09
 */
@Configuration
@EnableAutoConfiguration
@ConfigurationProperties(prefix = "spring.redis")
@Data
public class RedisConfig {

    /**
     * 服务器地址
     */
    private String host;

    /**
     * 连接端口
     */
    private Integer port;

    /**
     * 连接密码
     */
    private String password;

    /**
     * 超时时间
     */
    private Integer timeout;

    @Bean
    public JedisPoolConfig getRedisPoolConfig() {
        JedisPoolConfig config = new JedisPoolConfig();
        return config;
    }

    @Bean
    public JedisPool getJedisPool() {
        JedisPoolConfig config = getRedisPoolConfig();
        JedisPool pool = new JedisPool(config, host, port, timeout, password);
        return pool;
    }

}
