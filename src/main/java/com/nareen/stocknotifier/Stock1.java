package com.nareen.stocknotifier;

import java.util.ArrayList;

public class Stock1 implements Stock {
	String name;
	ArrayList<User> userList = new ArrayList<User>();
	private boolean priceChange = false;

	public Stock1(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setPriceChange(boolean priceChange) {
		this.priceChange = priceChange;
		notifyUser();
	}

	public void addUser(User user) {
		this.userList.add(user);
	}

	public void removeUser(User user) {
		this.userList.remove(user);
	}

	public void notifyUser() {
		for (User user : this.userList) {
			user.update(this);
		}
	}

	public boolean getPrice() {
		return this.priceChange;
	}
}
