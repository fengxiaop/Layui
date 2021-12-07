package com.qr.anti.base;

import java.util.List;

public class DataListValue<T> extends ReturnValue {
    private static final long serialVersionUID = -533092849666145420L;
    private List<T> dataList;

    public DataListValue() {
    }

    public DataListValue(String code, String desc) {
        super(code, desc);
    }

    public DataListValue(String code, String desc, List<T> dataList) {
        super(code, desc);
        this.dataList = dataList;
    }

    public DataListValue(Enum<?> en, List<T> dataList) {
        super(en.name(), en.toString());
        this.dataList = dataList;
    }

    public static <T> DataListValue<T> success(List<T> dataList) {
        DataListValue<T> returnData = new DataListValue("200", "success");
        returnData.setDataList(dataList);
        return returnData;
    }

    public List<T> getDataList() {
        return this.dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }
}
