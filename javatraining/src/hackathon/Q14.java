package hackathon;

import java.util.Scanner;

public class Q14 {
//Given a string print the reverse of the words string.(Input:  Java Code Output: Code Java)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Original string : ");
	 
	    String originalStr = sc.nextLine();
	    sc.close();
	 
	    String words[] = originalStr.split("\\s");
	    String reversedString = "";
	 
	    //Reverse each word's position
	    for (int i = words.length-1; i >=0; i--) { 
	    	reversedString=reversedString+" "+words[i];
	        } 
	 
	    // Displaying the string after reverse
	    System.out.print("Reversed string : " + reversedString);

	}

}
