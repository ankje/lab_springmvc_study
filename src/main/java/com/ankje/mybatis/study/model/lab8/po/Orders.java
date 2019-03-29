package com.ankje.mybatis.study.model.lab8.po;

import java.util.Date;
import java.util.List;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table orders
 */
public class Orders {
    private User user;
    private List<Orderdetail> orderDetail;
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.id
     *
     * @mbg.generated Fri Mar 29 13:43:46 GMT+08:00 2019
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   下单用户id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.user_id
     *
     * @mbg.generated Fri Mar 29 13:43:46 GMT+08:00 2019
     */
    private Integer userId;

    /**
     * Database Column Remarks:
     *   订单号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.number
     *
     * @mbg.generated Fri Mar 29 13:43:46 GMT+08:00 2019
     */
    private String number;

    /**
     * Database Column Remarks:
     *   创建订单时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.createtime
     *
     * @mbg.generated Fri Mar 29 13:43:46 GMT+08:00 2019
     */
    private Date createtime;

    /**
     * Database Column Remarks:
     *   备注
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.note
     *
     * @mbg.generated Fri Mar 29 13:43:46 GMT+08:00 2019
     */
    private String note;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.id
     *
     * @return the value of orders.id
     *
     * @mbg.generated Fri Mar 29 13:43:46 GMT+08:00 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.id
     *
     * @param id the value for orders.id
     *
     * @mbg.generated Fri Mar 29 13:43:46 GMT+08:00 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.user_id
     *
     * @return the value of orders.user_id
     *
     * @mbg.generated Fri Mar 29 13:43:46 GMT+08:00 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.user_id
     *
     * @param userId the value for orders.user_id
     *
     * @mbg.generated Fri Mar 29 13:43:46 GMT+08:00 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.number
     *
     * @return the value of orders.number
     *
     * @mbg.generated Fri Mar 29 13:43:46 GMT+08:00 2019
     */
    public String getNumber() {
        return number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.number
     *
     * @param number the value for orders.number
     *
     * @mbg.generated Fri Mar 29 13:43:46 GMT+08:00 2019
     */
    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.createtime
     *
     * @return the value of orders.createtime
     *
     * @mbg.generated Fri Mar 29 13:43:46 GMT+08:00 2019
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.createtime
     *
     * @param createtime the value for orders.createtime
     *
     * @mbg.generated Fri Mar 29 13:43:46 GMT+08:00 2019
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.note
     *
     * @return the value of orders.note
     *
     * @mbg.generated Fri Mar 29 13:43:46 GMT+08:00 2019
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.note
     *
     * @param note the value for orders.note
     *
     * @mbg.generated Fri Mar 29 13:43:46 GMT+08:00 2019
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public User getUser() {
        return user;
    }

    public Orders setUser(User user) {
        this.user = user;
        return this;
    }

    public List<Orderdetail> getOrderDetail() {
        return orderDetail;
    }

    public Orders setOrderDetail(List<Orderdetail> orderDetail) {
        this.orderDetail = orderDetail;
        return this;
    }
}