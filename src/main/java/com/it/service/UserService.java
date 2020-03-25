package com.it.service;


import com.it.pojo.TbUser;

/**
 * 服务层接口
 * @author
 *
 */
public interface UserService {

	/**
	 * 根据username获取实体
	 * @param username
	 * @return
	 */
	public TbUser findOne(String username);

}
