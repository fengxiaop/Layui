package com.qr.anti.base;


import java.util.List;

public class DataPageValue<T> extends ReturnValue {
    private static final long serialVersionUID = -8237109320765271196L;

    private List<T> dataList;

    private Long maxCount;

    private Integer currentPage;

    private Integer pageSize;

    private Integer maxPage;

    public DataPageValue() {
        this.currentPage = 1;
        this.pageSize = 10;
    }

    public DataPageValue(Enum<?> en) {
        this((List)null, 0L, 0, 0);
        super.setCode(en.name());
        super.setDesc(en.toString());
    }

    public DataPageValue(Enum<?> en, List<T> dataList, Long maxCount, Integer pageSize, Integer currentPage) {
        this(dataList, maxCount, pageSize, currentPage);
        super.setCode(en.name());
        super.setDesc(en.toString());
    }

    public DataPageValue(String code, String desc, List<T> dataList, Long maxCount, Integer pageSize, Integer currentPage) {
        this(dataList, maxCount, pageSize, currentPage);
        super.setCode(code);
        super.setDesc(desc);
    }

    public DataPageValue(List<T> dataList, Long maxCount, Integer pageSize, Integer currentPage) {
        super("200", "success");
        this.currentPage = 1;
        this.pageSize = 10;
        this.dataList = dataList;
        this.maxCount = maxCount;
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        if (maxCount % (long)pageSize == 0L) {
            this.maxPage = (int)(maxCount / (long)pageSize);
        } else {
            this.maxPage = (int)(maxCount / (long)pageSize + 1L);
        }

    }

    public List<T> getDataList() {
        return this.dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }

    public Long getMaxCount() {
        return this.maxCount;
    }

    public void setMaxCount(Long maxCount) {
        this.maxCount = maxCount;
    }

    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getMaxPage() {
        return this.maxPage;
    }

    public void setMaxPage(Integer maxPage) {
        this.maxPage = maxPage;
    }
}
