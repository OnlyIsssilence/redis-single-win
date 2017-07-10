package com.onlyisssilence.muya.netdemo3;

import com.onlyisssilence.muya.netdemo2.RedisClient;
import com.onlyisssilence.muya.netdemo3.dao.UserDao;
import com.onlyisssilence.muya.netdemo3.obj.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: MuYa
 * Date: 2017-07-10
 * Time: 下午 11:34
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
        UserDao userDAO = (UserDao) ac.getBean("userDao");
        User user1 = new User();
        user1.setId(1);
        user1.setName("obama");
        userDAO.saveUser(user1);
        User user2 = userDAO.getUser(1);
        System.out.println(user2.getName());
    }
}
