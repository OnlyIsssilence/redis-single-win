package com.onlyisssilence.muya.netdemo4;

import com.onlyisssilence.muya.netdemo4.redis.RedisClientTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: MuYa
 * Date: 2017-07-11
 * Time: 上午 12:03
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
        RedisClientTemplate redisClient = (RedisClientTemplate) ac.getBean("redisClientTemplate");
        redisClient.set("a", "abc");
        System.out.println(redisClient.get("a"));
    }
}
