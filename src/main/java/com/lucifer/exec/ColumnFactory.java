package com.lucifer.exec;

import java.util.Optional;

public class ColumnFactory {

	public static <T> Optional<BaseColumn> createColumn(String name, T value) {
		if (value.getClass().equals(String.class)) {
			return Optional.of(new StringColumn(name, (String)value));
		}
		
		if (value.getClass().equals(Integer.class)) {
			return Optional.of(new IntColumn(name, (Integer)value));
		}
		
		return Optional.empty();
	}
}
