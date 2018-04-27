package com.lucifer.item2;

import java.time.LocalDate;

public class Category {

	private final int id;
	private final String mark;
	private final LocalDate expiration;
	private final int cost;
	private final int capacity;
	
	public static class Builder {
		private final int id;
		private final String mark;
		
		private LocalDate expiration = LocalDate.now().plusYears(2);
		private int cost = 10;
		private int capacity = 350;
		
		
		private Builder(int id, String mark) {
		//public Builder(int id, String mark) {
			this.id = id;
			this.mark = mark;
		}
		
		public Category build() {
			return new Category(this);
		}
		
		public Builder expiration(LocalDate val) {
			this.expiration = val;
			return this;
		}
		
		public Builder cost(int val) {
			this.cost = val;
			return this;
		}
		
		public Builder capacity(int val) {
			this.capacity = val;
			return this;
		}
	}
	
	public static Builder newBuilder(int id, String mark) {
		return new Builder(id, mark);
	}
	
	private Category(Builder builder) {
		this.id = builder.id;
		this.mark = builder.mark;
		this.expiration = builder.expiration;
		this.cost = builder.cost;
		this.capacity = builder.capacity;
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

	public int getCost() {
		return cost;
	}

	public int getCapacity() {
		return capacity;
	}
}
