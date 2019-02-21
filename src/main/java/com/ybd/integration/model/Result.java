package com.ybd.integration.model;

/**
 * <pre>
 *
 * </pre>
 *
 * @author 杨帮东 (qq:397827222)
 * @version 1.0
 * @date 2019/02/21 21:33
 **/
public class Result <T> {

    private int code;

    private String msg;

    private T data;

    public static <T> Result<T> ok(T data)
    {
        Result<T> result = new Result<>();
        result.msg = "ok";
        result.code = 200;
        result.data = data;
        return result;
    }

    public static <T> Result<T> fail(int code, String msg, T data)
    {
        Result<T> result = new Result<>();
        result.code = code;
        result.msg = msg;
        result.data = data;
        return result;
    }


    public int getCode()
    {
        return code;
    }

    public void setCode(int code)
    {
        this.code = code;
    }

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }

    public T getData()
    {
        return data;
    }

    public void setData(T data)
    {
        this.data = data;
    }
}
