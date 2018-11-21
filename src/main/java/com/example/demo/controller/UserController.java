package com.example.demo.controller;

import com.example.demo.component.Result;
import com.example.demo.component.ResultCode;
import com.example.demo.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@Api(tags = "用户接口")
@RestController
@RequestMapping("user")
public class UserController {

    private static Set<User> users = new HashSet<>();

    @ApiOperation("添加用户")
    @PostMapping("addUser")
    public Result addUser(@RequestBody User user){
        users.add(user);
        return new Result(ResultCode.C200.getCode());
    }

    @ApiOperation("删除用户")
    @DeleteMapping("deleteUser")
    public Result deleteUser(@RequestParam String id){
        for (User user : users) {
            if(user.getId().equals(id)){
                users.remove(new User(id));
            }
        }
        return new Result(ResultCode.C200.getCode());
    }

    @ApiOperation("更新用户")
    @PutMapping("updateUser")
    public Result updateUser(@RequestBody User user){
        users.add(user);
        return new Result(ResultCode.C200.getCode());
    }

    @ApiOperation("获取用户")
    @GetMapping("getUser")
    public Result<User> getUser(@RequestParam String id){
        Result<User> result = new Result<>(ResultCode.C200.getCode());
        for (User user : users) {
            if(user.getId().equals(id)){
                result.setDataMap(user);
            }
        }
        return result;
    }

    @ApiOperation("获取所有用户")
    @GetMapping("getAllUser")
    public Result<Set<User>> getAllUser(){
        return new Result<>(ResultCode.C200.getCode(),users);
    }
}
