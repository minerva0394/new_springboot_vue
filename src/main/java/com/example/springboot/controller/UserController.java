package com.example.springboot.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springboot.entity.User;
import com.example.springboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.springboot.common.Result;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zengzl
 * @since 2022-03-20
 */
@RestController
@RequestMapping("/user")

public class UserController {
    @Autowired
    private IUserService userService;

    // 新增&修改
    @PostMapping
    public boolean save(@RequestBody User user) {
        return userService.saveUser(user);
    }

    // 查询所有
    @GetMapping
    public List<User> index() {
        return userService.list();
    }

    // 删除
    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Integer id) {
        return userService.removeById(id);
    }

    /**
     * 分页查询,pageNum和pageSize实现对前端传值的接收
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    // 用mybatis-plus进行分页查询
    @GetMapping("/page")
    public Result findPage(@RequestParam Integer pageNum,
                           @RequestParam Integer pageSize,
                           @RequestParam(defaultValue = "") String username,
                           @RequestParam(defaultValue = "") String email,
                           @RequestParam(defaultValue = "") String address) {

//        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//        queryWrapper.orderByDesc("id");
//        if (!"".equals(username)) {
//            queryWrapper.like("username", username);
//        }
//        if (!"".equals(email)) {
//            queryWrapper.like("email", email);
//        }
//        if (!"".equals(address)) {
//            queryWrapper.like("address", address);
//        }

        return Result.success(userService.findPage(new Page<>(pageNum, pageSize), username, email, address));
    }

}
