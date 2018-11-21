package com.example.demo.component;



import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author:杨果
 * @date:15/12/21 下午2:24
 * <p/>
 * <p>
 * 200
 * 成功
 * 301
 * 请求失败
 * 401
 * 未授权
 * 403
 * 无权访问该资源
 * 415
 * 请求格式错误
 * 500
 * 系统错误
 * 422
 * 校验错误
 * Description:
 */
@ApiModel(value = "Rest result", description = "请求结果")
public class Result<T> implements Serializable {
    private static final long serialVersionUID = -4696898674758059398L;
    @ApiModelProperty(value = "结果代码")
    private String code;

    @ApiModelProperty(value = "错误消息，返回失败情况下填充")
    private String message;

    @ApiModelProperty(value = "结果对象")
    private T dataMap;

    public Result() {

    }

    public Result(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public Result(String code, T dataMap) {
        this.code = code;
        this.dataMap = dataMap;
    }

    public Result(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getDataMap() {
        return dataMap;
    }

    public void setDataMap(T dataMap) {
        this.dataMap = dataMap;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", dataMap=" + dataMap +
                '}';
    }
}
