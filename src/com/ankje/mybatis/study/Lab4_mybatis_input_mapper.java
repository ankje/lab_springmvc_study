package com.ankje.mybatis.study;

import com.ankje.mybatis.study.dao_mapper.UserMapper;
import com.ankje.mybatis.study.model.User;
import com.ankje.mybatis.study.model.UserCustom;
import com.ankje.mybatis.study.model.UserQueryVo;
import com.ankje.util.Resp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("lab4")
public class Lab4_mybatis_input_mapper {

    private SqlSessionFactory sqlSessionFactory;

    public Lab4_mybatis_input_mapper() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("res/lab4/mybatisConfig.xml");
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
        List<UserCustom> users= userMapper.findUserList(userQueryVo);
        sqlSession.close();
        return users;
    }
}
