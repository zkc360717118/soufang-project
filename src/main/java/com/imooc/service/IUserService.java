package com.imooc.service;

import com.imooc.entity.User;

/**
 * 用户服务
 */
public interface IUserService {
    //返回用户表user对应的信息，和新增字字段authorities（该用户拥有的权限）
    User findUserByName(String userName);
}
