package com.wunian.service;

import com.wunian.service.UserInfoService;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wunian.dao.UserInfoDao; 
import com.wunian.entity.UserInfo;
/**
 * UserInfoService的实现类
 * @author Administrator
 *
 */
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {
	
	@Resource
	private UserInfoDao userInfoDao;

	@Override
	public UserInfo findUserById(Integer userId) {
		return userInfoDao.findUserById(userId);
	}

}
