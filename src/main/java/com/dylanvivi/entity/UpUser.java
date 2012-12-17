package com.dylanvivi.entity;

import java.math.BigDecimal;
import java.util.Date;

public class UpUser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UP_USER.USERID
     *
     * @mbggenerated Mon Dec 17 17:30:44 CST 2012
     */
    private BigDecimal userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UP_USER.USERNAME
     *
     * @mbggenerated Mon Dec 17 17:30:44 CST 2012
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UP_USER.PWD
     *
     * @mbggenerated Mon Dec 17 17:30:44 CST 2012
     */
    private String pwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UP_USER.ROLEID
     *
     * @mbggenerated Mon Dec 17 17:30:44 CST 2012
     */
    private BigDecimal roleid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UP_USER.STATUS
     *
     * @mbggenerated Mon Dec 17 17:30:44 CST 2012
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UP_USER.ISMANAGER
     *
     * @mbggenerated Mon Dec 17 17:30:44 CST 2012
     */
    private String ismanager;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UP_USER.LOGINTIME
     *
     * @mbggenerated Mon Dec 17 17:30:44 CST 2012
     */
    private Date logintime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UP_USER.SUBTIME
     *
     * @mbggenerated Mon Dec 17 17:30:44 CST 2012
     */
    private Date subtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UP_USER.EMAIL
     *
     * @mbggenerated Mon Dec 17 17:30:44 CST 2012
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UP_USER.NAME
     *
     * @mbggenerated Mon Dec 17 17:30:44 CST 2012
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UP_USER.USERID
     *
     * @return the value of UP_USER.USERID
     *
     * @mbggenerated Mon Dec 17 17:30:44 CST 2012
     */
    public BigDecimal getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UP_USER.USERID
     *
     * @param userid the value for UP_USER.USERID
     *
     * @mbggenerated Mon Dec 17 17:30:44 CST 2012
     */
    public void setUserid(BigDecimal userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UP_USER.USERNAME
     *
     * @return the value of UP_USER.USERNAME
     *
     * @mbggenerated Mon Dec 17 17:30:44 CST 2012
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UP_USER.USERNAME
     *
     * @param username the value for UP_USER.USERNAME
     *
     * @mbggenerated Mon Dec 17 17:30:44 CST 2012
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UP_USER.PWD
     *
     * @return the value of UP_USER.PWD
     *
     * @mbggenerated Mon Dec 17 17:30:44 CST 2012
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UP_USER.PWD
     *
     * @param pwd the value for UP_USER.PWD
     *
     * @mbggenerated Mon Dec 17 17:30:44 CST 2012
     */
    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UP_USER.ROLEID
     *
     * @return the value of UP_USER.ROLEID
     *
     * @mbggenerated Mon Dec 17 17:30:44 CST 2012
     */
    public BigDecimal getRoleid() {
        return roleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UP_USER.ROLEID
     *
     * @param roleid the value for UP_USER.ROLEID
     *
     * @mbggenerated Mon Dec 17 17:30:44 CST 2012
     */
    public void setRoleid(BigDecimal roleid) {
        this.roleid = roleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UP_USER.STATUS
     *
     * @return the value of UP_USER.STATUS
     *
     * @mbggenerated Mon Dec 17 17:30:44 CST 2012
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UP_USER.STATUS
     *
     * @param status the value for UP_USER.STATUS
     *
     * @mbggenerated Mon Dec 17 17:30:44 CST 2012
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UP_USER.ISMANAGER
     *
     * @return the value of UP_USER.ISMANAGER
     *
     * @mbggenerated Mon Dec 17 17:30:44 CST 2012
     */
    public String getIsmanager() {
        return ismanager;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UP_USER.ISMANAGER
     *
     * @param ismanager the value for UP_USER.ISMANAGER
     *
     * @mbggenerated Mon Dec 17 17:30:44 CST 2012
     */
    public void setIsmanager(String ismanager) {
        this.ismanager = ismanager == null ? null : ismanager.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UP_USER.LOGINTIME
     *
     * @return the value of UP_USER.LOGINTIME
     *
     * @mbggenerated Mon Dec 17 17:30:44 CST 2012
     */
    public Date getLogintime() {
        return logintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UP_USER.LOGINTIME
     *
     * @param logintime the value for UP_USER.LOGINTIME
     *
     * @mbggenerated Mon Dec 17 17:30:44 CST 2012
     */
    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UP_USER.SUBTIME
     *
     * @return the value of UP_USER.SUBTIME
     *
     * @mbggenerated Mon Dec 17 17:30:44 CST 2012
     */
    public Date getSubtime() {
        return subtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UP_USER.SUBTIME
     *
     * @param subtime the value for UP_USER.SUBTIME
     *
     * @mbggenerated Mon Dec 17 17:30:44 CST 2012
     */
    public void setSubtime(Date subtime) {
        this.subtime = subtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UP_USER.EMAIL
     *
     * @return the value of UP_USER.EMAIL
     *
     * @mbggenerated Mon Dec 17 17:30:44 CST 2012
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UP_USER.EMAIL
     *
     * @param email the value for UP_USER.EMAIL
     *
     * @mbggenerated Mon Dec 17 17:30:44 CST 2012
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UP_USER.NAME
     *
     * @return the value of UP_USER.NAME
     *
     * @mbggenerated Mon Dec 17 17:30:44 CST 2012
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UP_USER.NAME
     *
     * @param name the value for UP_USER.NAME
     *
     * @mbggenerated Mon Dec 17 17:30:44 CST 2012
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}