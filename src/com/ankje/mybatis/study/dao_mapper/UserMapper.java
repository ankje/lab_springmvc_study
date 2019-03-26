package com.ankje.mybatis.study.dao_mapper;

import com.ankje.mybatis.study.model.User;
import com.ankje.mybatis.study.model.UserCustom;
import com.ankje.mybatis.study.model.UserQueryVo;

import java.util.List;

public interface UserMapper {
    User findUserById(int id) throws Exception;
    List<User> findUserByName(String name) throws Exception;
    List<UserCustom> findUserList(UserQueryVo userQueryVo) throws Exception;
    List<UserCustom> findUserListOutMapper(UserQueryVo userQueryVo) throws Exception;
    int insertUser(User user) throws Exception;
    int deleteUser(int id) throws Exception;
    int updateUser(User user) throws Exception;
}
