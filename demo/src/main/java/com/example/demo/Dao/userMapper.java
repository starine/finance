package com.example.demo.Dao;

import com.example.demo.bean.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface userMapper {
    @Select("select * from user where userNum = #{userNum}")
    public User selectUserByuserNum(long userNum);

    @Select("select * from user where userName = #{userName}")
    public User selectUserByuserName(String  userName);

    @Select("select * from user where telephoneNum = #{telephoneNum}")
    public User selectUserBytelephoneNum(String telephoneNum);

    @Select("select count(*) from user")
    public long count();

    @Select("select * from user")
    public List<User> select();

    @Insert("insert into user(userNum, userName, userPwd,registerTime,userRight)" +
            " values (#{userNum},#{userName},#{userPwd},#{registerTime},#{userRight})")
    public void insertUser(long userNum,String userName,String userPwd,String registerTime,String userRight);


    @Insert("insert into user(userNum, userName, userPwd, userRight," +
            " telephoneNum, address, isIdentify, registerTime)" +
            " values (#{userNum},#{userName},#{userPwd},#{userRight}," +
            "#{telephoneNum},#{address},#{isIdentify},#{registerTime})")
    public void addUser(User users);

    @Update("update user set userNum=#{userNum},userName=#{userName}" +
            ",userPwd=#{userPwd},userRight=#{userRight}," +
            "telephoneNum=#{telephoneNum},address=#{address}," +
            "isIdentify=#{isIdentify},registerTime=#{registerTime}where userNum=#{userNum}")
    public void updateUser(User users);

    @Delete("delete from user where userNum=#{userNum}")
    public void deleteUser(long userNum);
}
