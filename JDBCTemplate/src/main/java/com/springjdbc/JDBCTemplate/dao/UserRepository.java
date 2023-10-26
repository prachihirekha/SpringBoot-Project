package com.springjdbc.JDBCTemplate.dao;

import com.springjdbc.JDBCTemplate.entity.User;

import java.util.List;


public interface UserRepository {
   User insertUser(User user);
   User updateUser(User user);
   User getBYId(int id);
 String deleteById(int id) ;
    List<User> getAllUser();
}
