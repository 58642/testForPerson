package com.yang.test.mapper;

import com.yang.test.model.User;

public interface BaseMapper<T> {
    public T findById(Integer id);

    public void deleteById(Integer id);

    public void update(T t);

    public void add(T t);
}
