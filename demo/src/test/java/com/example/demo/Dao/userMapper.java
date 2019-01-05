package com.example.demo.Dao;

import com.example.demo.bean.user;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface userMapper {
    @Select("select * from user where userNum = #{userNum}")
    public user selectUserByuserNum(int userNum);

    @Select("select * from user")
    public List<user> select();

    @Insert("insert into user(userNum, userName, userPwd, userRight," +
            " tureName, idNum, telephoneNum, address, isIdentify, registerTime)" +
            " values (#{userNum},#{userName},#{userPwd},#{userRight},#{tureName}," +
            "#{idNum},#{telephoneNum},#{address},#{isIdentify},#{registerTime})")
    public void addUser(user users);

    @Update("update user set userNum=#{userNum},userName=#{userName}" +
            ",userPwd=#{userPwd},userRight=#{userRight},tureName=#{tureName}," +
            "idNum=#{idNum},telephoneNum=#{telephoneNum},address=#{address}," +
            "isIdentify=#{isIdentify},registerTime=#{registerTime}where userNum=#{userNum}")
    public void updateUser(user users);

    @Delete("delete from user where userNum=#{userNum}")
    public void deleteUser(String userNum);
}
