package com.lucifer.exec;

public abstract class BaseColumn {

	private Object value;
	
	protected BaseColumn(Object value) {
		this.value = value;
	}
	
	protected void setObjValue(Object value) {
		this.value = value;
	}
	
	protected Object getObjValue() {
		return this.value;
	}

	public abstract Class<?> columeType();
}
