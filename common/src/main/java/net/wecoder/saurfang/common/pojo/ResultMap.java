package net.wecoder.saurfang.common.pojo;



import java.util.HashMap;
import java.util.Map;

public class ResultMap extends HashMap<String, Object> {

    private static final long serialVersionUID = 1L;

    private static final int ERROR = 500;

    private static final int SUCCESS = 0;

    public ResultMap() {
        put("code", SUCCESS);
        put("msg", "success");
    }

    public static ResultMap error() {
        return error(ERROR, "未知异常，请联系管理员");
    }

    public static ResultMap error(String msg) {
        return error(ERROR, msg);
    }

    public static ResultMap error(int code, String msg) {
        ResultMap r = new ResultMap();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    public static ResultMap ok() {
        return new ResultMap();
    }

    public static ResultMap ok(String msg) {
        ResultMap r = new ResultMap();
        r.put("msg", msg);
        return r;
    }

    public static ResultMap ok(Map<String, Object> map) {
        ResultMap r = new ResultMap();
        r.putAll(map);
        return r;
    }


    @Override
    public ResultMap put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
