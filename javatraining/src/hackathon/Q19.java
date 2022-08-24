package hackathon;

import java.util.Scanner;

public class Q19 {
// WJP to display number of occurrence of all character

	public static void main(String[] args) {

		String str;				
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a string: ");
		str = scanner.nextLine();
		
		for (int i = 0; i < str.length(); i++) {
			int count=1;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
				count++;					
				}
			}
			System.out.println(str.charAt(i) + "->"+count);
		}
	}

}
