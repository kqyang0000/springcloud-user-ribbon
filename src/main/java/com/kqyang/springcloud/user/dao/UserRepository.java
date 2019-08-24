package com.kqyang.springcloud.user.dao;

import com.kqyang.springcloud.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by kayang on 2019/8/20
 */
public interface UserRepository extends JpaRepository<User, Long> {
}