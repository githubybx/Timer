package com.example.demo.Redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 对封装的jedis的一些方法的封装
 */
@RestController
public class RedisTest {
   @Autowired
    RedisService redisService;
   @RequestMapping("/world")
    public void get(){
       redisService.set("hello","jiaji");
       String hello = redisService.get("hello");
       System.out.println("取出的值是hello");
       redisService.set("num","10");
       redisService.incr("num");
       redisService.incr("num");
       redisService.decr("num");
       redisService.expire("hello",100);
       Long hello1 = redisService.ttl("hello");
       System.out.println("设置的有效期是"+hello1);
   }
}
