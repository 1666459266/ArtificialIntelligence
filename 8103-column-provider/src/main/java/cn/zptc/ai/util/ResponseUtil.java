package cn.zptc.ai.util;

public class ResponseUtil {
    private Integer code;//请求状态码

    private Object data;//请求数据

    private String msg;//请求响应信息

    public ResponseUtil(Integer code) {
        this.code = code;
    }

    public ResponseUtil(Integer code, Object data) {
        this.code = code;
        this.data = data;
    }

    public ResponseUtil(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResponseUtil(Integer code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
