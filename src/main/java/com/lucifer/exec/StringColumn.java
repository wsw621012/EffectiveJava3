package com.lucifer.exec;

public class StringColumn extends BaseColumn implements Column<String> {

	public StringColumn(String name, String value) {
		super(name, value);		
	}

	@Override
	public String getValue() {
		return (String)super.getObjValue();
	}

	@Override
	public void setValue(String value) {
		super.setObjValue(value);
	}

	@Override
	public Class<?> columeType() {
		return String.class;
	}
	
}
