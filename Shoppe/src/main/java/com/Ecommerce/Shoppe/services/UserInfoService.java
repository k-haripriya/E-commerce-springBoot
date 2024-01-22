package com.Ecommerce.Shoppe.services;

import com.Ecommerce.Shoppe.DuplicateEmailException;
import com.Ecommerce.Shoppe.entity.UserInfo;

public interface UserInfoService {


    UserInfo addUser(UserInfo userInfo) throws DuplicateEmailException;


    UserInfo findEmail(String email);
}
