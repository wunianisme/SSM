package com.wunian.dao;

import com.wunian.entity.UserInfo;

public interface UserInfoDao {

	UserInfo findUserById(Integer userId);
}
