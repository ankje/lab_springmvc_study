package com.ankje.mybatis.study;

import com.ankje.mybatis.study.dao_mapper.UserMapper;
import com.ankje.mybatis.study.model.UserCustom;
import com.ankje.mybatis.study.model.UserQueryVo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Controller
@RequestMapping("lab5")
public class Lab5_mybatis_output_mapper {

    private SqlSessionFactory sqlSessionFactory;

    public Lab5_mybatis_output_mapper() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("res/lab5/mybatisConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        this.sqlSessionFactory = sqlSessionFactory;
    }

    //*******查
    @ResponseBody
    @RequestMapping(value = {"user_list"},method = {RequestMethod.POST})
    public List<UserCustom> findUserList(@RequestBody UserCustom userCustom) throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        UserQueryVo userQueryVo = new UserQueryVo();
        userQueryVo.setUserCustom(userCustom);
        List<UserCustom> users= userMapper.findUserListOutMapper(userQueryVo);
        sqlSession.close();
        return users;
    }
}
