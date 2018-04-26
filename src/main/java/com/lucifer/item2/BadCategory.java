package com.lucifer.item2;

import java.time.LocalDate;

public class BadCategory {

	private int id;
	private String mark;
	private LocalDate expiration;
	private int cost;
	private int capacity;

	public static class Builder {

		private BadCategory category;
		
		public Builder() {
			category = new BadCategory();
		}
		
		public BadCategory build() {
			return category;
		}
		
		public Builder withCapacity(int capacity) {
			category.setCapacity(capacity);
			return this;
		}
		
		public Builder withCost(int cost) {
			category.setCost(cost);
			return this;
		}
		
		public Builder withId(int id) {
			category.setId(id);
			return this;
		}
		
		public Builder withMark(String mark) {
			category.setMark(mark);
			return this;
		}
		
		public Builder withExpiration(LocalDate expiration) {
			category.setExpiration(expiration);
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
