package com.onlyfullstack.lambdas;

@FunctionalInterface
public interface IConnection {

	public void connect();
	
	default void print() {
		System.out.println("in default print method");
	}
	
	static void description() {
		System.out.println("in static method");
	}
}
