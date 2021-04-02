package com.dunin.observer;

public class Main {

    public static void main(String[] args) {
	Client1 client1 = new Client1();
	Client2 client2 = new Client2();
		Subject subject = new Subject();
		subject.subscribe(client1);
		subject.subscribe(client2);
		subject.startWork();

		extracted("hello how are you");
		extracted("i am fine");


	}

	private static void extracted(String message) {
		System.out.println(message);
	}
}
