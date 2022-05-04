package math.java.project;

import java.util.Scanner;

public class AddNumber {

	public int add(int a,int b){
		return a+b;
		}
	
	public static void main(String[] args) {
		
		AddNumber mathDemo = new AddNumber();
		int sum = mathDemo.add(5,4);
		
		System.out.println("Sum is "+sum);
		
	/*	int a = 5;
		int b = 10;
		
		int sum = a + b;

		System.out.println(sum);
		*/
		
		
	/*
		int num1, num2, summ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();
        
        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();
        
        sc.close();
        summ = num1 + num2;
        System.out.println("Sum of these numbers: "+summ);
        
      */  
	}

}
