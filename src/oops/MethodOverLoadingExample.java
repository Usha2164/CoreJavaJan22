package oops;

public class MethodOverLoadingExample {
	
	public void sum(int a, int b) {
		
		int result;
		
		result = a+b;
		System.out.println("Sum is " + result);
	}
	
public void sum(int a, int b, int c) {
		
		int result;
		
		result = a+b+c;
		System.out.println("Sum is " + result);
	}

}
