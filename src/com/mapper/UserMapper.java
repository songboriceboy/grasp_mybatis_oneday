package com.mapper;

import com.domain.User;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/3/11.
 */
public interface UserMapper {
    public User findUserById(int id);

    public List<User> findAllUsers();
    //添加用户信息
    public int addUser(User user);

    //删除用户信息
    public int deleteUser(int id);

    public int updateUserById(User user);

    public List<User> findUserList(User user);
    public int findUserCount();
    public List<User> findUserList2(User user);

    public List<Map<String,Object>> getAllOrderInfo();
}
