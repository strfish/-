package com.example.hzsr_layuidemo1.Vo;

import java.util.HashMap;
import java.util.Map;

public class menuVo {
    //提示信息
    private String msg;
    //状态码 0成功 1失败
    private int code;
    //数据信息
    private Map<String,Object> data = new HashMap<String,Object>();

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "menuVo{" +
                "msg='" + msg + '\'' +
                ", code=" + code +
                ", data=" + data +
                '}';
    }
}
