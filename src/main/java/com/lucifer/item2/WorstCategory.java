package com.lucifer.item2;

import java.time.LocalDate;

// Telescoping Constructor Pattern 
public class WorstCategory {

	private final int id;
	private final String mark;
	private final LocalDate expiration;
	private final int cost;
	private final int capacity;

	public WorstCategory(int id, String mark, LocalDate expiration, int cost, int capacity) {
		this.id = id;
		this.mark = mark;
		this.expiration = expiration;
		this.cost = cost;
		this.capacity = capacity;
	}

	public WorstCategory(int id, String mark, LocalDate expiration, int cost) {
		this(id, mark, expiration, cost, 350);
	}
	
	public WorstCategory(int id, String mark, LocalDate expiration) {
		this(id, mark, expiration, 10, 350);
	}
	
	public WorstCategory(int id, String mark) {
		this(id, mark, LocalDate.now().plusYears(2), 10, 350);
	}
	
	public int getCapacity() {
		return capacity;
	}

	public int getCost() {
		return cost;
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
	
}
