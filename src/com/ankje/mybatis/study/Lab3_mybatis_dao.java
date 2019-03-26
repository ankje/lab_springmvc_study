package com.ankje.mybatis.study;

import com.ankje.mybatis.study.model.User;
import com.ankje.mybatis.study.dao_mapper.UserMapper;
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
@RequestMapping("lab3")
public class Lab3_mybatis_dao {

    private SqlSessionFactory sqlSessionFactory;

    public Lab3_mybatis_dao() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("res/lab3/mybatisConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        this.sqlSessionFactory = sqlSessionFactory;
    }

    //增
    @ResponseBody
    @RequestMapping(value = {"user"},method = {RequestMethod.POST})
    public Map<String,Object> insert(@RequestBody User user) throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        Integer affectNum = userMapper.insertUser(user);
        sqlSession.commit();
        sqlSession.close();
        if(affectNum==0){
            return Resp.fail();
        }
        Map<String,Integer> data = new HashMap<>();
        data.put("id",user.getId());
        return Resp.success(data);
    }

    //删
    @ResponseBody
    @RequestMapping(value = {"user/delete/{id}"},method = {RequestMethod.GET})
    public Map<String,Object> delete(@PathVariable("id") Integer id) throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        Integer affectNum= userMapper.deleteUser(id);
        sqlSession.commit();
        sqlSession.close();
        if(affectNum==0){
            return Resp.fail();
        }
        Map<String,Integer> data = new HashMap<>();
        data.put("affect_num",affectNum);
        return Resp.success(data);
    }

    //改
    @ResponseBody
    @RequestMapping(value = {"user"},method = {RequestMethod.PUT})
    public Map<String,Object> update(@RequestBody User user) throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        Integer affectNum= userMapper.updateUser(user);
        sqlSession.commit();
        sqlSession.close();
        if(affectNum==0){
            return Resp.fail();
        }
        Map<String,Integer> data = new HashMap<>();
        data.put("affect_num",affectNum);
        return Resp.success(data);
    }

    //*******查
    @ResponseBody
    @RequestMapping(value = {"user/{id}"},method = {RequestMethod.GET})
    public User findById(@PathVariable("id") Integer id) throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user= userMapper.findUserById(id);
        sqlSession.close();
        return user;
    }

    @ResponseBody
    @RequestMapping(value = {"like/{name}"},method = {RequestMethod.GET})
    public List<User> findByName(@PathVariable("name") String name) throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users= userMapper.findUserByName(name);
        sqlSession.close();
        return users;
    }
}
