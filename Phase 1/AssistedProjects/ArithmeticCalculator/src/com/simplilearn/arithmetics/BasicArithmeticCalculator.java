package com.simplilearn.arithmetics;

import java.util.*;

public class BasicArithmeticCalculator {

	public static void main(String[] args) {
		
		char op;
		
		double a , b , c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose any operator: + , - , * , / , or % ");
		op = sc.next().charAt(0);
		
		if (op == 'E') {
			System.out.println("You entered a wrong operator.");
		}
		
		else {
			
			System.out.println("Enter value of a: ");
			a = sc.nextDouble();
			
			System.out.println("Enter value of b: ");
			b = sc.nextDouble();
		
			switch(op) {
			
				case '+':
					c = a+b;
					System.out.println(a+"+"+b+"="+c);
					break;
			
				case '-':
					c = a-b;
					System.out.println(a+"-"+b+"="+c);
					break;
	
				case '*':
					c = a*b;
					System.out.println(a+"*"+b+"="+c);
					break;
				
				case '/':
					c = a/b;
					System.out.println(a+"/"+b+"="+c);
					break;
					
				case '%':
					c = a%b;
					System.out.println(a+"%"+b+"="+c);
					break;
				
				default:
					System.out.println("Invalid Operator!!!...");
					break;
				}
			}
		sc.close();
	}

}
