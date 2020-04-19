package com.example.admin.system.UserController;

import com.example.admin.system.po.User;
import com.example.admin.system.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {

    @Resource
    UserService userService;

    @RequestMapping("/selectUserList")
    public List<User> selectUserList(int page ,int size){
        List<User> userList = userService.selectUserList(page ,size);
        return userList;
    }
}
