package javapractice;

import java.util.Scanner;

public class StringPractice6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("input your name : ");
		String name = sc.next();
		System.out.print("input your search : ");
		String search = sc.next();		 
		    System.out.println(name.indexOf(search)+1);
		  

	}

}
