package com.example.admin.system.service.impl;

import com.example.admin.system.mapper.UserMapper;
import com.example.admin.system.po.User;
import com.example.admin.system.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public List<User> selectUserList(int page, int size) {
        return userMapper.selectUserList( page,  size);
    }
}
