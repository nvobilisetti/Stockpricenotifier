package com.nareen.stocknotifier;

public class TestObserver {
	public static void main(String[] args) {
		User1 user1 = new User1("user1");
		User1 user2 = new User1("user2");
		User1 user3 = new User1("user3");
		Stock1 stock1 = new Stock1("stock1");
		Stock1 stock2 = new Stock1("stock2");
		Stock1 stock3 = new Stock1("stock3");
		
		stock1.addUser(user1);
		stock1.addUser(user2);
		stock2.addUser(user2);
		stock2.addUser(user3);
		stock3.addUser(user3);
		
		/*user1.subscribeStock(stock1);
		user1.subscribeStock(stock2);
		user2.subscribeStock(stock2);
		user2.subscribeStock(stock3);
		user3.subscribeStock(stock3);*/
		
		stock1.setPriceChange(true);
		stock2.setPriceChange(false);
		stock3.setPriceChange(false);
	}
}
