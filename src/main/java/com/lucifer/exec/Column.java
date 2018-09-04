package com.lucifer.exec;

public interface Column<T> {

	T getValue();
	
	void setValue(T t);
	
	String getName();
	
	Class<?> columeType();
}
