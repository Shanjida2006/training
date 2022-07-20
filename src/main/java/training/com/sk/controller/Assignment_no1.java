package training.com.sk.controller;

public class Assignment_no1 {
	public static void main(String[] args)
	{
		int num1=5, num2=10;
		int sum=num1+num2;
		System.out.println("Arithmetic operation-addition: "+sum);
		System.out.println("Unary operation: "+ ++sum);
		System.out.println("Unary operation: "+sum++);
		System.out.println( num1>num2);
		
		if((num1%2==0)&&(num2%2==0)) 
			System.out.println("Both numbers are even. ");
		else 
			System.out.println("Both numbers are not even. ");
	}

}
