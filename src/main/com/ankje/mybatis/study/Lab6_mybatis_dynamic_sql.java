package com.ankje.mybatis.study;

import com.ankje.mybatis.study.model.dao_mapper.lab6.UserMapper;
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
@RequestMapping("lab6")
public class Lab6_mybatis_dynamic_sql {

    private SqlSessionFactory sqlSessionFactory;

    public Lab6_mybatis_dynamic_sql() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("lab6/mybatisConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        this.sqlSessionFactory = sqlSessionFactory;
    }

    //*******查
    @ResponseBody
    @RequestMapping(value = {"user_list_ids"},method = {RequestMethod.POST})
    public List<UserCustom> findUserList(@RequestBody List<Integer> ids) throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<UserCustom> users= userMapper.findUserListWhereForeach(new UserQueryVo().setIds(ids));
        sqlSession.close();
        return users;
    }
}
