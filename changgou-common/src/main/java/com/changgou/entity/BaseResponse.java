package com.changgou.entity;

import java.io.Serializable;

/**
 * @author :fengyifan
 * @desc: 统一返回
 * @param <T>
 */
public class BaseResponse<T> implements Serializable {
    private boolean flag;//是否成功
    private Integer code;//返回码
    private String message;//返回消息
    private T data;//返回数据

    public BaseResponse(boolean flag, Integer code, String message, Object data) {
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = (T) data;
    }

    public BaseResponse(boolean flag, Integer code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }

    public BaseResponse() {
        this.flag = true;
        this.code = StatusCode.OK;
        this.message = "操作成功!";
    }

    /**
     * 操作成功
     */
    public static BaseResponse SUCCESS() {
        return new BaseResponse();
    }

    public static BaseResponse SUCCESS(String _message){
        return new BaseResponse(false,StatusCode.OK,_message,null);
    }

    public static <T> BaseResponse SUCCESS(String _message, T _data) {
        return new BaseResponse(false,StatusCode.OK,_message,_data);
    }
    /**
     * 操作失败
     */
    public static BaseResponse FAIL(){
        return new BaseResponse(false,StatusCode.ERROR,"操作失败!",null);
    }

    public static BaseResponse FAIL(String _message) {
        return new BaseResponse(false,StatusCode.ERROR,_message,null);
    }

    public static <T> BaseResponse FAIL(String _message, T _data) {
        return new BaseResponse(false,StatusCode.ERROR,_message,_data);
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
