package com.nareen.stocknotifier;

import java.util.ArrayList;

public class User1 implements User {
	String name;
	//private ArrayList<Stock> subscribedList = new ArrayList<Stock>();

	public User1(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void update(Stock stk) {
		
		if (stk.getPrice()) {
			System.out.println(this.getName() + " Got the item " + stk.getName() + " " + stk.getPrice());
			unSubscribe(stk);
		} else {
			System.out.println(this.getName() + " item unavailable " + stk.getName() + " " + stk.getPrice());
		}
		
		
		/*for (Stock stk : subscribedList) {
			if (stk.getPrice()) {
				System.out.println(this.getName() + " Got the item " + stk.getName() + " " + stk.getPrice());
				unSubscribe();
			} else {
				System.out.println(this.getName() + " item unavailable " + stk.getName() + " " + stk.getPrice());
			}
		}*/
	}

	public void unSubscribe(Stock stk) {
			stk.removeUser(this);
			System.out.println(stk.getName() + " removed for " + this.getName());
		/*for (Stock stk : subscribedList) {
			if (stk.getPrice()) {
				stk.removeUser(this);
				System.out.println(stk.getName() + " removed for " + this.getName());
			}
		}*/
	}

	/*public void subscribeStock(Stock stock) {
		this.subscribedList.add(stock);
		stock.addUser(this);
	}*/
}
