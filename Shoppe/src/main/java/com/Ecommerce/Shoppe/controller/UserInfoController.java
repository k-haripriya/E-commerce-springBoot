package com.Ecommerce.Shoppe.controller;

import com.Ecommerce.Shoppe.DuplicateEmailException;
import com.Ecommerce.Shoppe.entity.UserInfo;
import com.Ecommerce.Shoppe.services.UserInfoService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserInfoController {
   @Autowired
    private UserInfoService userInfoService;

    @PostMapping("/addUser")
    public UserInfo addUser(@RequestBody UserInfo userInfo) throws DuplicateEmailException {

        return userInfoService.addUser(userInfo);
    }


    @GetMapping("/findUser/{email}")
    public UserInfo findEmail(@PathVariable String email){
        return userInfoService.findEmail(email);
    }
}
