package com.ankje.util;

import java.util.HashMap;
import java.util.Map;

public class Resp {
    public static Map<String,Object> success(){
        Map<String,Object> mapResp = new HashMap<>();
        mapResp.put("code",200);
        mapResp.put("msg","操作成功");
        return mapResp;
    }

    public static Map<String,Object> success(String msg){
        Map<String,Object> mapResp = new HashMap<>();
        mapResp.put("code",200);
        mapResp.put("msg",msg);
        return mapResp;
    }

    public static Map<String,Object> success(Integer code){
        Map<String,Object> mapResp = new HashMap<>();
        mapResp.put("code",code);
        mapResp.put("msg","操作成功");
        return mapResp;
    }

    public static Map<String,Object> success(Object data){
        Map<String,Object> mapResp = new HashMap<>();
        mapResp.put("code",200);
        mapResp.put("msg","操作成功");
        mapResp.put("data",data);
        return mapResp;
    }

    public static Map<String,Object> success(Object data,Integer code,String msg){
        Map<String,Object> mapResp = new HashMap<>();
        mapResp.put("code",code);
        mapResp.put("msg",msg);
        mapResp.put("data",data);
        return mapResp;
    }

    public static Map<String,Object> fail(){
        Map<String,Object> mapResp = new HashMap<>();
        mapResp.put("code",201);
        mapResp.put("msg","操作失败");
        return mapResp;
    }

    public static Map<String,Object> fail(String msg){
        Map<String,Object> mapResp = new HashMap<>();
        mapResp.put("code",201);
        mapResp.put("msg",msg);
        return mapResp;
    }

    public static Map<String,Object> fail(Integer code){
        Map<String,Object> mapResp = new HashMap<>();
        mapResp.put("code",code);
        mapResp.put("msg","操作失败");
        return mapResp;
    }

    public static Map<String,Object> fail(Object data){
        Map<String,Object> mapResp = new HashMap<>();
        mapResp.put("code",201);
        mapResp.put("msg","操作失败");
        mapResp.put("data",data);
        return mapResp;
    }

    public static Map<String,Object> fail(Integer code,String msg){
        Map<String,Object> mapResp = new HashMap<>();
        mapResp.put("code",code);
        mapResp.put("msg",msg);
        return mapResp;
    }

    public static Map<String,Object> fail(Integer code,String msg,Object data){
        Map<String,Object> mapResp = new HashMap<>();
        mapResp.put("code",code);
        mapResp.put("msg",msg);
        mapResp.put("data",data);
        return mapResp;
    }
}
