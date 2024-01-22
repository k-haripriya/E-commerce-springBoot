package com.Ecommerce.Shoppe.services.IMPL;

import com.Ecommerce.Shoppe.DuplicateEmailException;
import com.Ecommerce.Shoppe.entity.UserInfo;
import com.Ecommerce.Shoppe.repository.UserInfoRepository;
import com.Ecommerce.Shoppe.services.UserInfoService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceIMPL implements UserInfoService {
    @Autowired
    private UserInfoRepository userInfoRepository;

    @Override
    public UserInfo addUser(UserInfo userInfo) throws DuplicateEmailException {
        String email = userInfo.getEmail();
        UserInfo ExistingUser = userInfoRepository.findByEmail(email);
        if (ExistingUser == null) {
            return userInfoRepository.save(userInfo);


        }
        throw new DuplicateEmailException("User with email " + email + " already exists");

    }

    @Override
    public UserInfo findEmail(String email) {
        UserInfo ExistingUser = userInfoRepository.findByEmail(email);
        if( ExistingUser != null)
        {
            return ExistingUser;
        }
        throw new RuntimeException("User not Found");
    }
}
