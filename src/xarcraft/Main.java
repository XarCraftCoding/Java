package xarcraft;

public class Main {
	public static void main(String[] args) {
		int x = 100;							// Value: -2,147,483,647 - 2,147,483,647
		float pi = 3.14159265f;					// Value: -2,147,483,647 - 2,147,483,647
		double e = 2.718281828;					// Value: -2,147,483,647 - 2,147,483,647
		boolean bool = true;					// Value: 0 - 1
		char character = 'A';					// Value: 1 - 1
		String hello_world = "Hello, World!";	// Value: 0 - 2,147,483,647

		System.out.println(
			"Integer: " + x + '\n' +
			"Float: " + pi + '\n' +
			"Double: " + e + '\n' +
			"Boolean: " + bool + '\n' +
			"Character: " + character + '\n' +
			"String: " + hello_world
		);
	}
}