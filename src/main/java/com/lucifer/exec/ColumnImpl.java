package com.lucifer.exec;

public class ColumnImpl<T> extends BaseColumn implements Column<T> {
	
	private Class<?> clazz;

	public ColumnImpl(T value) {
		super(value);
		this.clazz = value.getClass();
	}

	@SuppressWarnings("unchecked")
	@Override
	public T getValue() {
		return (T) super.getObjValue();
	}

	@Override
	public void setValue(T value) {
		super.setObjValue(value);
	}

	@Override
	public Class<?> columeType() {
		return clazz;
	}

}
