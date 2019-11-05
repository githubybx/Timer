package com.example.demo.Redis;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Service
public class RedisService {
    @Autowired
    JedisPool jedisPool;
    public void set(String key, String value) {
        Jedis jedis = null;
        if (jedisPool == null) {
            System.out.println("为null");
        } else {
            jedis = jedisPool.getResource();
            try {
                if (jedis == null) {
                    System.out.println("获取jedispool失败");
                } else {
                    jedis.set(key, value);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                jedis.close();
            }
        }
    }
    public String get(String key){
        Jedis jedis = null;
        String s = null;
        if(jedisPool != null){
            try {
                jedis = jedisPool.getResource();
                if(jedis != null){
                     s = jedis.get(key);
                    return s;
                }else {
                    return null;
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                jedis.close();
                return s;
            }
        }
        else {
            return null;
        }
    }
    public void incr(String str){
        Jedis jedis = null;
        if(jedisPool != null){
            try {
                jedis = jedisPool.getResource();
                if(jedis != null){
                    jedis.incr(str);
                }else {
                    System.out.println("jedis为null");
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                jedis.close();
            }
        }else {
            System.out.println("jedispool为null");
        }
    }
    public void decr(String str){
        Jedis jedis = null;
        if(jedisPool != null){
            try {
                jedis = jedisPool.getResource();
                if(jedis != null){
                    jedis.decr(str);
                }else {
                    System.out.println("jedis为null");
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                jedis.close();
            }
        }else {
            System.out.println("jedispool为null");
        }
    }
    public Long ttl(String str){
        Jedis jedis = null;
        Long ttl = 0l;
        if(jedisPool != null){
            try {
                jedis = jedisPool.getResource();
                if(jedis != null){
                    ttl = jedis.ttl(str);
                }else {
                    return -999l;
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                jedis.close();
                return ttl;
            }
        }else {
            return -999l;
        }
    }
    public void expire(String str, int seconds){
        Jedis jedis = null;
        if(jedisPool != null){
            try {
                jedis = jedisPool.getResource();
                if(jedis != null){
                    jedis.expire(str,seconds);
                }else {
                    System.out.println("jedis为null");
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                jedis.close();
            }
        }else {
            System.out.println("jedisPoll为kong");
        }
    }
}
