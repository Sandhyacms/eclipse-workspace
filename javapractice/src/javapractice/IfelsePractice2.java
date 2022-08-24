package javapractice;

import java.util.Scanner;

public class IfelsePractice2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter your marks : ");
		int marks=sc.nextInt();
		if(marks>75) {
			System.out.println("first div");
			
		}
		else if(marks<=75 && marks>=45) {
			System.out.println("second div");
		}else {
			System.out.println("fail");
		}
			

	}

}
