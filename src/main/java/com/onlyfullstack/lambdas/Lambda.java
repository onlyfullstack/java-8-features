package com.onlyfullstack.lambdas;

public class Lambda {

	public static void main(String[] args) {
		IConnection connection = () -> {System.out.println("Implementing the connect method");};
		
		connection.connect();
		connection.print();
		IConnection.description();
		simpleConceptWithRunnable();
	}
	
	private static void simpleConceptWithRunnable() {
		Runnable runnable = new Runnable() { // boilerplate code which needs to be written everytime
			@Override
			public void run() {
				System.out.println("Inside annonymos inner class");
			}
		};
		
		Runnable runnable2 = () -> { // Lambda expression
										System.out.println("Inside lambda expression");
									};
		
		Thread thread = new Thread(runnable);
		thread.start();
		
		thread = new Thread(runnable2);
		thread.start();
		
		SingleParam singleParam = (param) -> {System.out.printf("Hello %s\n",param);};
		singleParam.print("saurabh");
		
		DoubleParam doubleParam = (param1, param2) -> System.out.printf("param1 : %s, param2: %s\n", param1, param2);
		doubleParam.print("OnlyFullstack", "Development");
	}

	interface SingleParam {
		public void print(String param);
	}
	
	interface DoubleParam {
		public void print(String param1, String param2);
	}
}
