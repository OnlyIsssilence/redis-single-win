package com.onlyisssilence.muya.netdemo3.dao;

import com.onlyisssilence.muya.netdemo3.obj.User;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: MuYa
 * Date: 2017-07-10
 * Time: 下午 11:24
 */
public interface UserDao {

    public void saveUser(User user);

    public User getUser(long id);
}
