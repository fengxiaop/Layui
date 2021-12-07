package com.qr.anti.base;

/**
 * @Author：胡侯东
 * @Date：2021/3/1 4:31 下午
 * @Desc:
 */

import java.util.List;

public interface BaseRepository<T> {
    void add(T var1);

    void update(T var1);

    T queryById(Object var1);
}
