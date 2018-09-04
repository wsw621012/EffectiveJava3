package com.lucifer.exec;

public abstract class BaseColumn {

	private String name;
	private Object value;
	
	protected BaseColumn(String name, Object value) {
		this.name = name;
		this.value = value;
	}
	
	protected void setObjValue(Object value) {
		this.value = value;
	}
	
	protected Object getObjValue() {
		return this.value;
	}

	public String getName() {
		return name;
	}
	
}
