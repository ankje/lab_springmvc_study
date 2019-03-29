package com.ankje.mybatis.study;

import com.ankje.mybatis.study.model.UserCustom;
import com.ankje.mybatis.study.model.UserQueryVo;
import com.ankje.mybatis.study.model.lab7.mapper.OrdersMapper;
import com.ankje.mybatis.study.model.lab7.mapper.UserMapper;
import com.ankje.mybatis.study.model.lab7.po.Orders;
import com.ankje.mybatis.study.model.lab7.po.OrdersExample;
import com.ankje.mybatis.study.model.lab7.po.UserExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("lab7")
public class Lab7_mybatis_1to1 {

    private SqlSessionFactory sqlSessionFactory;

    public Lab7_mybatis_1to1() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("lab7_mybatisConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        this.sqlSessionFactory = sqlSessionFactory;
    }

    //*******查 联查order和user表
    @ResponseBody
    @RequestMapping(value = {"orderListWithUser/{lessId}/{userId}"},method = {RequestMethod.GET})
    public List<Orders> orderListWithUser(@PathVariable("lessId") int lessId,@PathVariable("userId") int userId) throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersMapper Mapper = sqlSession.getMapper(OrdersMapper.class);
        OrdersExample ordersExample = new OrdersExample();
        OrdersExample.Criteria orderCriteria = ordersExample.createCriteria();
        orderCriteria.andIdLessThan(lessId);
        UserExample userExample = new UserExample();
        UserExample.Criteria userCriteria = userExample.createCriteria();
        if(userId>0)
            userCriteria.andIdEqualTo(userId);
        List<Orders> orders= Mapper.selectByWhereWithUser(ordersExample,userExample);
        sqlSession.close();
        return orders;
    }
}
