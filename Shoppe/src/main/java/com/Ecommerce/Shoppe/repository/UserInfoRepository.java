package com.Ecommerce.Shoppe.repository;

import com.Ecommerce.Shoppe.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo,Long> {
    UserInfo findByEmail(String email);
}
