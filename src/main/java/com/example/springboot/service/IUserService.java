package com.example.springboot.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springboot.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author zengzl
 * @since 2022-03-20
 */
public interface IUserService extends IService<User> {

    boolean saveUser(User user);

    Page<User> findPage(Page<User> objectPage, String username, String email, String address);


//    public boolean saveUser(User user) {
//        return saveOrUpdate(user);
//    }

}
