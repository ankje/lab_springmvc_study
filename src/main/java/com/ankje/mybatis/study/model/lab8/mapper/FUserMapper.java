package com.ankje.mybatis.study.model.lab8.mapper;

import com.ankje.mybatis.study.model.lab8.po.FUser;
import com.ankje.mybatis.study.model.lab8.po.FUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table f_user
     *
     * @mbg.generated Fri Mar 29 13:43:46 GMT+08:00 2019
     */
    long countByExample(FUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table f_user
     *
     * @mbg.generated Fri Mar 29 13:43:46 GMT+08:00 2019
     */
    int deleteByExample(FUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table f_user
     *
     * @mbg.generated Fri Mar 29 13:43:46 GMT+08:00 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table f_user
     *
     * @mbg.generated Fri Mar 29 13:43:46 GMT+08:00 2019
     */
    int insert(FUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table f_user
     *
     * @mbg.generated Fri Mar 29 13:43:46 GMT+08:00 2019
     */
    int insertSelective(FUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table f_user
     *
     * @mbg.generated Fri Mar 29 13:43:46 GMT+08:00 2019
     */
    List<FUser> selectByExample(FUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table f_user
     *
     * @mbg.generated Fri Mar 29 13:43:46 GMT+08:00 2019
     */
    FUser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table f_user
     *
     * @mbg.generated Fri Mar 29 13:43:46 GMT+08:00 2019
     */
    int updateByExampleSelective(@Param("record") FUser record, @Param("example") FUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table f_user
     *
     * @mbg.generated Fri Mar 29 13:43:46 GMT+08:00 2019
     */
    int updateByExample(@Param("record") FUser record, @Param("example") FUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table f_user
     *
     * @mbg.generated Fri Mar 29 13:43:46 GMT+08:00 2019
     */
    int updateByPrimaryKeySelective(FUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table f_user
     *
     * @mbg.generated Fri Mar 29 13:43:46 GMT+08:00 2019
     */
    int updateByPrimaryKey(FUser record);
}