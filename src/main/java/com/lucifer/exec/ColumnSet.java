package com.lucifer.exec;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ColumnSet {

	private Map<String, BaseColumn> columns = new HashMap<>();

	private Optional<BaseColumn> getBaseColumn(String name) {
		BaseColumn bc = columns.get(name);
		return bc != null ? Optional.of(bc) : Optional.empty();
	}

	public <T> void setValue(String name, T value) {
		Optional<BaseColumn> op = getBaseColumn(name);

		if (!op.isPresent()) {
			columns.put(name, ColumnFactory.createColumn(name, value).get());
			return;
		}

		if (op.get() instanceof Column<?>) {
			Column<?> c = ((Column<?>) op.get());
			if (c.columeType().equals(value.getClass())) {
				op.get().setObjValue(value);
			}
			throw new IllegalArgumentException();
		}
	}

	@SuppressWarnings("unchecked")
	public <T> T getValue(String name, Class<T> clazz) {
		Optional<BaseColumn> op = getBaseColumn(name);
		if (op.isPresent() && op.get() instanceof Column<?>) {
			Column<?> c = ((Column<?>) op.get());
			if (c.columeType().equals(clazz)) {
				return (T) (op.get().getObjValue());
			}
		}
		throw new IllegalArgumentException();
	}

	public void setString(String name, String value) {
		Optional<BaseColumn> op = getBaseColumn(name);

		if (!op.isPresent()) {
			columns.put(name, new StringColumn(name, value));
			return;
		}

		if (op.get() instanceof StringColumn) {
			((StringColumn) op.get()).setValue(name);
		}

		throw new IllegalArgumentException();
	}

	public String getString(String name) {
		Optional<BaseColumn> op = getBaseColumn(name);

		if (op.isPresent()) {
			if (op.get() instanceof StringColumn) {
				return ((StringColumn) op.get()).getValue();
			}
		}
		throw new IllegalArgumentException();
	}
}
