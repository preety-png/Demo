package com.honeywell.dao;

import java.util.List;


public interface Dao<T> {

	T get(long id);

	List<T> getAll();

	T save(T t);

	boolean delete(T t);

}
