package com.test;

import com.domain.User;
import com.mapper.UserMapper;
import com.util.SqlSessionFactoryUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/3/11.
 */
public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        //创建sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建usermapper对象,mybatis自动生成代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //调用UserMapper的方法
//        User user = userMapper.findUserById(1);
//        System.out.println(user.getUsername());
//        List<User> userList = userMapper.findAllUsers();
//        for(User user : userList)
//        {
//            System.out.println(user.getUsername());
//        }

//        User user = new User();
//        SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd");
//        user.setUsername("田志");
//        user.setSex("男");
//        user.setBirthday(sdf.parse("2016-11-29"));
//        user.setAddress("江西南昌");
//        userMapper.addUser(user);
//        System.out.println(user.getId());
//        sqlSession.commit();

//        userMapper.deleteUser(1);
//        sqlSession.commit();

//        SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd");
//
//        User user = new User();
//        //根据id更新用户信息
//        user.setId(24);
//        user.setUsername("张四风2");
//        user.setBirthday(sdf.parse("2015-01-12"));
//        user.setSex("女");
//        user.setAddress("上海黄埔");
//
//        userMapper.updateUserById(user);
//
//        //提交事务
//        sqlSession.commit();

//        User user = new User();
//        user.setSex("1");
//        user.setUsername("%张%");
//
//        //调用UserMapper的方法
//        List<User> list = userMapper.findUserList(user);
//
//        for(User u : list)
//        {
//            System.out.println(u.getUsername());
//        }

//        int count = userMapper.findUserCount();
//        System.out.println(count);

//        User user = new User();
////        user.setSex("1");
//        user.setUsername("%张%");
//
//        //调用UserMapper的方法
//        List<User> list = userMapper.findUserList2(user);
//
//        for(User u : list)
//        {
//            System.out.println(u.getUsername());
//        }

        List<Map<String,Object>> mapList = userMapper.getAllOrderInfo();
        for(Map<String,Object> map : mapList)
        {
            System.out.println("---------------");
            for(Map.Entry<String,Object> entry : map.entrySet())
            {
                System.out.println(entry.getKey()+" "+entry.getValue());
            }

        }
    }
}
