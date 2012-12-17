package com.dylanvivi.dao;

import com.dylanvivi.entity.UpUser;
import com.dylanvivi.entity.UpUserExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UP_USER
     *
     * @mbggenerated Mon Dec 17 17:30:44 CST 2012
     */
    int countByExample(UpUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UP_USER
     *
     * @mbggenerated Mon Dec 17 17:30:44 CST 2012
     */
    int deleteByExample(UpUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UP_USER
     *
     * @mbggenerated Mon Dec 17 17:30:44 CST 2012
     */
    int deleteByPrimaryKey(BigDecimal userid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UP_USER
     *
     * @mbggenerated Mon Dec 17 17:30:44 CST 2012
     */
    int insert(UpUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UP_USER
     *
     * @mbggenerated Mon Dec 17 17:30:44 CST 2012
     */
    int insertSelective(UpUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UP_USER
     *
     * @mbggenerated Mon Dec 17 17:30:44 CST 2012
     */
    List<UpUser> selectByExample(UpUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UP_USER
     *
     * @mbggenerated Mon Dec 17 17:30:44 CST 2012
     */
    UpUser selectByPrimaryKey(BigDecimal userid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UP_USER
     *
     * @mbggenerated Mon Dec 17 17:30:44 CST 2012
     */
    int updateByExampleSelective(@Param("record") UpUser record, @Param("example") UpUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UP_USER
     *
     * @mbggenerated Mon Dec 17 17:30:44 CST 2012
     */
    int updateByExample(@Param("record") UpUser record, @Param("example") UpUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UP_USER
     *
     * @mbggenerated Mon Dec 17 17:30:44 CST 2012
     */
    int updateByPrimaryKeySelective(UpUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UP_USER
     *
     * @mbggenerated Mon Dec 17 17:30:44 CST 2012
     */
    int updateByPrimaryKey(UpUser record);
}