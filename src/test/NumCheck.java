package test;

import java.util.Scanner;

public class NumCheck {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int number = scanner.nextInt();
		
		if(number%2==0) {
			System.out.println("Even number");
		}
			else
			{
				System.out.println("Odd number");
		}
		scanner.close();
	}

}
