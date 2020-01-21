package com.scs.soft.zhihu.app.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zhuyan
 * @ClassName Result
 * @Description 返回给客户端的结果对象
 * @Date 2020/1/16
 * @Version 1.0
 **/
@Data
public class Result implements Serializable {

    private static final long serialVersionUID = -3948389268046368059L;

    private Integer code;

    private String msg;

    private Object data;

    private Result() {
    }

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static Result success() {
        Result result = new Result();
        result.setResultCode(com.scs.soft.zhihu.app.common.ResultCode.SUCCESS);
        return result;
    }

    public static Result success(Object data) {
        Result result = new Result();
        result.setResultCode(com.scs.soft.zhihu.app.common.ResultCode.SUCCESS);
        result.setData(data);
        return result;
    }

    public static Result failure(com.scs.soft.zhihu.app.common.ResultCode resultCode) {
        Result result = new Result();
        result.setResultCode(resultCode);
        return result;
    }

    public static Result failure(com.scs.soft.zhihu.app.common.ResultCode resultCode, Object data) {
        Result result = new Result();
        result.setResultCode(resultCode);
        result.setData(data);
        return result;
    }

    public void setResultCode(com.scs.soft.zhihu.app.common.ResultCode code) {
        this.code = code.code();
        this.msg = code.message();
    }
}