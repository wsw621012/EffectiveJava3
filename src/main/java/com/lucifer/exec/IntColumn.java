package com.lucifer.exec;

public class IntColumn extends BaseColumn implements Column<Integer> {

	public IntColumn(String name, Integer value) {
		super(name, value);
	}

	@Override
	public void setValue(Integer value) {
		super.setObjValue(value);
	}

	@Override
	public Integer getValue() {
		return (Integer) super.getObjValue();
	}


	@Override
	public Class<?> columeType() {
		return Integer.class;
	}

}
