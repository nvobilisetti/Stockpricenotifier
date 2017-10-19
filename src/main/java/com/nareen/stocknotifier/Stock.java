package com.nareen.stocknotifier;

public interface Stock {
	public String getName();

	public boolean getPrice();

	public void addUser(User user);

	public void removeUser(User user);

	public void notifyUser();
}
