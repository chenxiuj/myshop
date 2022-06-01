package com.itqf.dao;

import com.itqf.entity.User;

import java.sql.SQLException;

/**
 * 负责用户模块数据库访问的接口
 */
public interface UserDao {

    User  selectUserByUname(String username) throws SQLException;

    int   insertUser(User user) throws SQLException;

    User selectUserByCode(String code) throws SQLException;

    int updateStatusByUid(int uid) throws SQLException;

}

