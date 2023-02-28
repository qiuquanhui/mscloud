package com.atguigu.springcloud.utils;

import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 通用返回结果，服务端响应的数据最终都会封装成此对象
 * @param <T>
 */
@Data
public class R<T> implements Serializable{


    private Integer code; //编码：200成功，5000和其它数字为失败


    private String messge; //错误信息


    private T data; //数据


    private Map map = new HashMap(); //动态数据

    public static <T> R<T> success(T object) {
        R<T> r = new R<T>();
        r.data = object;
        r.code = 200;
        r.messge="成功";
        return r;
    }

    public static <T> R<T> success() {
        R<T> r = new R<T>();
        r.code = 200;
        r.messge="成功";
        return r;
    }

    public static <T> R<T> error(String msg) {
        R r = new R();
        r.messge = msg;
        r.code = 0;
        return r;
    }

    public R<T> add(String key, Object value) {
        this.map.put(key, value);
        return this;
    }


}

