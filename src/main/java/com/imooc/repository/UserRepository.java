package com.imooc.repository;

import com.imooc.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * User 是实体类
 * Long 是主键类型
 */
public interface UserRepository extends CrudRepository<User,Long> {
    User findByName(String userName);
}
