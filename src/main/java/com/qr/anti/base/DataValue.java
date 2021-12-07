package com.qr.anti.base;

/**
 * @Author：胡侯东
 * @Date：2021/3/1 5:52 下午
 * @Desc:
 */



public class DataValue<T> extends ReturnValue {
    private static final long serialVersionUID = -4183409003088415431L;

    private T data;

    public DataValue() {
    }

    public DataValue(String code, String desc) {
        super(code, desc);
    }

    public DataValue(String code, String desc, T data) {
        super(code, desc);
        this.data = data;
    }

    public DataValue(Enum<?> en, T data) {
        super(en.name(), en.toString());
        this.data = data;
    }

    public static <T> DataValue<T> success(T data) {
        DataValue<T> returnData = new DataValue("200", "success");
        returnData.setData(data);
        return returnData;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }
}