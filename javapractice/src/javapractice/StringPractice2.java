package javapractice;

import java.util.Scanner;

public class StringPractice2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter your full name : ");
		String  fullname=sc.next();
		String[] fullnamelist=fullname.split(",");
		System.out.println("first name is: "+fullnamelist[0]);
		System.out.println("middle name is: "+fullnamelist[1]);
		System.out.println("last name is: "+fullnamelist[2]);
		
		for(int i=0;i<fullnamelist.length;i++) {
			System.out.println(fullnamelist[i]);
		}

	}
	

}
