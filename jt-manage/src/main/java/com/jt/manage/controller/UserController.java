package com.jt.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description: java类作用描述
 * @Author: my
 * @CreateDate: 2019/1/8 22:03
 * @UpdateUser:
 * @UpdateDate: 2019/1/8 22:03
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @ResponseBody
    public String userController(){
        return "helloword";
    }
}
