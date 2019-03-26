package com.ankje.mybatis.study.dao_mapper;

import com.ankje.mybatis.study.model.User;

import java.util.List;

public interface UserMapper {
    User findUserById(int id) throws Exception;
    List<User> findUserByName(String name) throws Exception;
    int insertUser(User user) throws Exception;
    int deleteUser(int id) throws Exception;
    int updateUser(User user) throws Exception;
}
