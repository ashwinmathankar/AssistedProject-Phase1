package com.simplilearn.validate;

import java.util.Scanner;

public class EmailValidate {
	
	public static void main(String[] args) {
		String n;
		String array[]= {"ashwin@gmail.com","shailesh@gmail.com","suryansh@gmail.com"};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your correct Email:");
		n=sc.next();
		if(array[0].equals(n)){
			System.out.println("User Authenticated");	
		}
		else if(array[1].equals(n))
		{
			System.out.println("User Authenticated");
		}
		else if(array[2].equals(n))
		{
			System.out.println("User Authenticated");
		}
		else
		{
			System.out.println("User is not Authenticated");
		}
		sc.close();
	}

}
