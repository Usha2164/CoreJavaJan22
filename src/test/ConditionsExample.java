package test;

import java.util.Scanner;

public class ConditionsExample {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your Age ");
		
		int age = scanner.nextInt();
		
		if(age>=18) {
			System.out.println("You are eligbile for voting");
		}else {
			int eligibleYear = 18 -age;
			System.out.println("You are not eligible for voting this year, try after " + eligibleYear);
		}
		
		scanner.close();
	}

}
