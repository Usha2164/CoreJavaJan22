package test;

public class DataTypesExample {
	
	public static void main (String args[]) {
		
		int num1 = 40;
		int num2 = 30;
		
		int sum = num1+num2;
		int sub = num1-num2;
		int mul = num1*num2;
		float div = (float) num1/num2;
		
		//addition +
		//subtraction -
		//multiplication *
		//division /
		
		
		System.out.println("The sum of two numbers is " +sum);
		System.out.println("The Subtraction of two numbers is " +sub);
		System.out.println("The multiplication of two numbers is " +mul);
		System.out.println("The division of two numbers is " +div);
		
	
		String name = "Clean India Green India";
		System.out.println("Total num of Chars are :" +name.length());
		
		char char1 = name.charAt(0);
		char char2 = name.charAt(name.length() -1);
		System.out.println("Char at first place is " +char1);
		System.out.println("Char at last place is " +char2);
		
		System.out.println("The string in uppercase " + name.toUpperCase());
		System.out.println("The string in lowercase " + name.toLowerCase());
		
	
	
	}

}
