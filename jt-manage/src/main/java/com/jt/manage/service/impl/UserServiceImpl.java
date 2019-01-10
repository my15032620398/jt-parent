package com.jt.manage.service.impl;

import com.jt.manage.mapper.UserMapper;
import com.jt.manage.service.UserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

//    public int insert(User pojo){
//        return userMapper.insert(pojo);
//    }

//    public int insertSelective(User pojo){
//        return userMapper.insertSelective(pojo);
//    }
//
//    public int insertList(List<User> pojos){
//        return userMapper.insertList(pojos);
//    }
//
//    public int update(User pojo){
//        return userMapper.update(pojo);
//    }
}
