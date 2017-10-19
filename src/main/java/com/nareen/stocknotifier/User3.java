package com.nareen.stocknotifier;

import java.util.ArrayList;

public class User3  {
	private ArrayList<Stock> subscribedList = new ArrayList<Stock>();

	public void update() {
		System.out.println("Got the item ");
		unSubscribe();
	}

	public void unSubscribe() {
		for (Stock stk : subscribedList) {
			if (!stk.getPrice()) {
				//stk.removeUser(this);
				System.out.println(stk.getClass().getName() + " removed ");
			}
		}
	}

	public void subscribeStock(Stock stock) {
		this.subscribedList.add(stock);
	}
}
