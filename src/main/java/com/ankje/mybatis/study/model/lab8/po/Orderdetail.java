package com.ankje.mybatis.study.model.lab8.po;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table orderdetail
 */
public class Orderdetail {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdetail.id
     *
     * @mbg.generated Fri Mar 29 13:43:46 GMT+08:00 2019
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   订单id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdetail.orders_id
     *
     * @mbg.generated Fri Mar 29 13:43:46 GMT+08:00 2019
     */
    private Integer ordersId;

    /**
     * Database Column Remarks:
     *   商品id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdetail.items_id
     *
     * @mbg.generated Fri Mar 29 13:43:46 GMT+08:00 2019
     */
    private Integer itemsId;

    /**
     * Database Column Remarks:
     *   商品购买数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdetail.items_num
     *
     * @mbg.generated Fri Mar 29 13:43:46 GMT+08:00 2019
     */
    private Integer itemsNum;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdetail.id
     *
     * @return the value of orderdetail.id
     *
     * @mbg.generated Fri Mar 29 13:43:46 GMT+08:00 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdetail.id
     *
     * @param id the value for orderdetail.id
     *
     * @mbg.generated Fri Mar 29 13:43:46 GMT+08:00 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdetail.orders_id
     *
     * @return the value of orderdetail.orders_id
     *
     * @mbg.generated Fri Mar 29 13:43:46 GMT+08:00 2019
     */
    public Integer getOrdersId() {
        return ordersId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdetail.orders_id
     *
     * @param ordersId the value for orderdetail.orders_id
     *
     * @mbg.generated Fri Mar 29 13:43:46 GMT+08:00 2019
     */
    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdetail.items_id
     *
     * @return the value of orderdetail.items_id
     *
     * @mbg.generated Fri Mar 29 13:43:46 GMT+08:00 2019
     */
    public Integer getItemsId() {
        return itemsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdetail.items_id
     *
     * @param itemsId the value for orderdetail.items_id
     *
     * @mbg.generated Fri Mar 29 13:43:46 GMT+08:00 2019
     */
    public void setItemsId(Integer itemsId) {
        this.itemsId = itemsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdetail.items_num
     *
     * @return the value of orderdetail.items_num
     *
     * @mbg.generated Fri Mar 29 13:43:46 GMT+08:00 2019
     */
    public Integer getItemsNum() {
        return itemsNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdetail.items_num
     *
     * @param itemsNum the value for orderdetail.items_num
     *
     * @mbg.generated Fri Mar 29 13:43:46 GMT+08:00 2019
     */
    public void setItemsNum(Integer itemsNum) {
        this.itemsNum = itemsNum;
    }
}