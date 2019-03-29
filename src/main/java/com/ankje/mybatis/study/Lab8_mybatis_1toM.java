package com.ankje.mybatis.study;

import com.ankje.mybatis.study.model.lab8.mapper.OrdersMapper;
import com.ankje.mybatis.study.model.lab8.po.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("lab8")
public class Lab8_mybatis_1toM {

    private SqlSessionFactory sqlSessionFactory;

    public Lab8_mybatis_1toM() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("lab8_mybatisConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        this.sqlSessionFactory = sqlSessionFactory;
    }

    //*******查 联查order和user表
    @ResponseBody
    @RequestMapping(value = {"selectWithUserOrderDetail"},method = {RequestMethod.POST})
    public List<Orders> selectWithUserOrderDetail(@RequestBody MultWhereMap multWhereMap) throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersMapper Mapper = sqlSession.getMapper(OrdersMapper.class);
        OrdersExample ordersExample = new OrdersExample();
        UserExample userExample = new UserExample();
        OrderdetailExample orderdetailExample = new OrderdetailExample();
        List<Orders> orders= Mapper.selectWithUserOrderDetail(ordersExample,userExample,orderdetailExample);
        sqlSession.close();
        return orders;
    }
}

class MultWhereMap{
    private Orders orders;
    private User user;
    private Orderdetail orderdetail;

    public Orders getOrders() {
        return orders;
    }

    public MultWhereMap setOrders(Orders orders) {
        this.orders = orders;
        return this;
    }

    public User getUser() {
        return user;
    }

    public MultWhereMap setUser(User user) {
        this.user = user;
        return this;
    }

    public Orderdetail getOrderdetail() {
        return orderdetail;
    }

    public MultWhereMap setOrderdetail(Orderdetail orderdetail) {
        this.orderdetail = orderdetail;
        return this;
    }
}
