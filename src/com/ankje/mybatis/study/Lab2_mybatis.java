package com.ankje.mybatis.study;

import com.ankje.mybatis.study.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Controller
@RequestMapping("user")
public class Lab2_mybatis {

    @ResponseBody
    @RequestMapping(value = {"{id}"},method = {RequestMethod.GET})
    public User findUserById(@PathVariable("id") Integer id) throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("res/lab2/mybatisConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("test.findUserById",id);
        sqlSession.close();
        return user;
    }

    @ResponseBody
    @RequestMapping(value = {"like/{name}"},method = {RequestMethod.GET})
    public List<User> findUserByName(@PathVariable("name") String name) throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("res/lab2/mybatisConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> users = sqlSession.selectList("test.findUserByName",name);
        sqlSession.close();
        return users;
    }
}
