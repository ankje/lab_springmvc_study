package com.ankje.mybatis.study;

import com.ankje.mybatis.study.model.User;
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
@RequestMapping("user")
public class Lab2_mybatis {

    //增
    @ResponseBody
    @RequestMapping(value = {""},method = {RequestMethod.POST})
    public Map<String,Object> insert(@RequestBody User user) throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("res/lab2/mybatisConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Integer affectNum = sqlSession.insert("test.insertUser",user);
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
    @RequestMapping(value = {"delete/{id}"},method = {RequestMethod.GET})
    public Map<String,Object> delete(@PathVariable("id") Integer id) throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("res/lab2/mybatisConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Integer affectNum= sqlSession.delete("test.deleteUser",id);
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
    @RequestMapping(value = {""},method = {RequestMethod.PUT})
    public Map<String,Object> update(@RequestBody User user) throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("res/lab2/mybatisConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Integer affectNum= sqlSession.update("test.updateUser",user);
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
    @RequestMapping(value = {"{id}"},method = {RequestMethod.GET})
    public User findById(@PathVariable("id") Integer id) throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("res/lab2/mybatisConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("test.findUserById",id);
        sqlSession.close();
        return user;
    }

    @ResponseBody
    @RequestMapping(value = {"like/{name}"},method = {RequestMethod.GET})
    public List<User> findByName(@PathVariable("name") String name) throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("res/lab2/mybatisConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> users = sqlSession.selectList("test.findUserByName",name);
        sqlSession.close();
        return users;
    }
}
