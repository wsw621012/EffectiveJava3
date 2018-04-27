package com.lucifer.item2;

import java.time.LocalDate;

public class BadCategory {

	private int id;
	private String mark;
	private LocalDate expiration;
	private int cost;
	private int capacity;

	public static class FakeBuilder {

		private BadCategory category;
		
		public FakeBuilder() {
			category = new BadCategory();
		}
		
		public BadCategory build() {
			return category;
		}
		
		public FakeBuilder capacity(int val) {
			category.setCapacity(val);
			return this;
		}
		
		public FakeBuilder cost(int val) {
			category.setCost(val);
			return this;
		}
		
		public FakeBuilder id(int val) {
			category.setId(val);
			return this;
		}
		
		public FakeBuilder mark(String val) {
			category.setMark(val);
			return this;
		}
		
		public FakeBuilder expiration(LocalDate val) {
			category.setExpiration(val);
			return this;
		}
	}
	
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public String getMark() {
		return mark;
	}

	public LocalDate getExpiration() {
		return expiration;
	}

	public void setExpiration(LocalDate expiration) {
		this.expiration = expiration;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

}
