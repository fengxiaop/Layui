package com.qr.anti.base;

import java.util.List;

public interface BaseRepository<T> {
    void add(T var1);

    void update(T var1);

    T queryById(Object var1);
}
