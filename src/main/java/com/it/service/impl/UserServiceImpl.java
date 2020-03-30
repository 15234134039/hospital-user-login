package com.it.service.impl;


import com.it.mapper.TbUserMapper;
import com.it.pojo.TbUser;
import com.it.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 服务实现层
 * @author
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private TbUserMapper userMapper;

	/**
	 * 根据username获取实体
	 * @param username
	 * @return
	 */
	@Override
	public TbUser findOne(String username){
		return userMapper.selectByUserName(username);
	}

	@Override
	public int insert(TbUser user) {
		return userMapper.insert(user);
	}
}
