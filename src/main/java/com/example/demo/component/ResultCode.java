package com.example.demo.component;

/**
 * @author:杨果
 * @date:16/3/10 上午9:29
 * <p/>
 * Description:
 * <p/>
 * REST接口返回的结果状态码,这些结果状态码参照HTTP协议
 */
public enum ResultCode {
    C200("200", "成功"),
    C401("401", "未授权"),
    C403("403", "无权访问该资源"),
    C404("404", "请求资源未找到"),
    C415("415", "请求格式错误"),
    C422("422", "校验错误"),
    C500("500", "服务器内部错误"),
    C406("406", "数据未找到"),


    C1010("1010","输入信息不符合采购订单创建条件")
    ;

    private String code;//code
    private String desc;//description

    ResultCode(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
