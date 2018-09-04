package com.lucifer.exec;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ColumnSet {

	private Map<String, BaseColumn> columns = new HashMap<>();

	public <T> void setValue(String name, T value) {
		columns.put(name, new ColumnImpl<T>(value));
	}

	@SuppressWarnings("unchecked")
	public <T> T getValue(String name, Class<T> clazz) {
		BaseColumn bc = columns.get(name);
		
		if (bc != null && bc.columeType().equals(clazz)) {
			return (T) (bc.getObjValue());
		}
		
		throw new IllegalArgumentException();
	}
	
}
