package classPractice;

import java.util.Scanner;

public class ClassPractice6 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String a=in.next();
		String b=in.next();
		
		skname s=new skname();
		s.getInput(a,b);
		s.printname();
		
	}

}

class skname {
	String Firstname = "";
	String Lastname = "";

	skname(String s, String k) {
		Firstname = s;
		Lastname = k;
	}
	
	skname(){
	}
	
	void getInput(String s, String k) {
	Firstname = s;
	Lastname = k;
	
	}
	
	void printname() {
		System.out.println(Firstname+" " + Lastname);
	}
}