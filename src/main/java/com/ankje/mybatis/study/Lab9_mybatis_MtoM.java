package com.ankje.mybatis.study;

import com.ankje.mybatis.study.model.lab8.mapper.OrdersMapper;
import com.ankje.mybatis.study.model.lab8.mapper.UserMapper;
import com.ankje.mybatis.study.model.lab8.po.*;
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
@RequestMapping("lab9")
public class Lab9_mybatis_MtoM {

    private SqlSessionFactory sqlSessionFactory;

    public Lab9_mybatis_MtoM() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("lab9_mybatisConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        this.sqlSessionFactory = sqlSessionFactory;
    }

    //*******查 多对多 查询用户买过的商品
    @ResponseBody
    @RequestMapping(value = {"selectUsersBuyItems"},method = {RequestMethod.POST})
    public List<User> selectUsersBuyItems() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper Mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users= Mapper.selectUsersBuyItems();
        sqlSession.close();
        return users;
    }
}
