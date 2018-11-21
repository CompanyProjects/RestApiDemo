package com.example.demo.controller;

import com.example.demo.component.Result;
import com.example.demo.component.ResultCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "订单接口")
@RestController
@RequestMapping("order")
public class OrderController {

    @ApiOperation("删除订单")
    @DeleteMapping("deleteOrder")
    public Result deleteOrder(@ApiParam(name = "orderId",required = true) @RequestParam String id){
        return new Result(ResultCode.C200.getCode());
    }

}
