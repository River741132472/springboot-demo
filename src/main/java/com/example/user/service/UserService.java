package com.example.admin.system.service;

import com.example.admin.system.po.User;

import java.util.List;

public interface UserService {
    List<User> selectUserList(int page, int size);
}
