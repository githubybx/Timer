package com.example.demo.Redis;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@Service
public class JedisPoolFactory {
    @Bean
    public JedisPool getJedisPool(){
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxWaitMillis(1000);
        jedisPoolConfig.setMaxTotal(10);
        jedisPoolConfig.setMaxIdle(8);
        JedisPool jedisPool = new JedisPool(jedisPoolConfig,"127.0.0.1",6379,1000,"123",0);
        return jedisPool;
    }
}
