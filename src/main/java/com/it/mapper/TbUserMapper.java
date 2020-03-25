package com.it.mapper;


import com.it.pojo.TbUser;

public interface TbUserMapper {

    TbUser selectByUserName(String username);

}