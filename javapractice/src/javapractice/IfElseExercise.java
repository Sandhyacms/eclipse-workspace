package javapractice;

import java.util.Scanner;

public class IfElseExercise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter your marks : ");
		int marks = sc.nextInt();
		if (marks < 45) {
			System.out.println("fail");

		}
		
		if(marks<75) {
			System.out.println("you are below 75");
		}
		else {
			System.out.println("you are above 75");	
		}
		
		
		

	}

}
