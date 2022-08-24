package classPractice;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ClassPractice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		sum s=new sum();
		s.a = sc.nextInt();
		s.b = sc.nextInt();
		s.printsum();
		
		sumreturn sr = new sumreturn(); 
		sr.a = s.a;
		sr.b = s.b;
		System.out.println(sr.printsum());
		*/
		sumconst scon = new sumconst(sc.nextInt(),sc.nextInt());
		System.out.println( scon.printsum());
		sumconst.scannerString();
		
		sumconst.scannerFile();

	}

}

class sum {
	int a = 0;
	int b = 0;

	void printsum() {
		System.out.println(a + b);
	}
}

class sumreturn {
	int a = 0;
	int b = 0;

	public int printsum() {
		return a + b;
	}
}

class sumconst {
	int i = 0;
	int j = 0;
	
	sumconst(int a, int b ){
		i=a;
		j=b;
	}
	sumconst(int b ){
		i=40;
		j=b;
	}

	public int printsum() {
		return i + j;
	}
	
	public static void scannerString() {
		 String s = "Hello, This is JavaTpoint. \n second line";  
         //Create scanner Object and pass string in it  
         Scanner scan = new Scanner(s);  
         //Check if the scanner has a token  
         System.out.println("Boolean Result: " + scan.hasNext());  
         //Print the string  
         System.out.println("String: " +scan.nextLine()); 
         System.out.println("String: " +scan.nextLine()); 
         scan.close();  
         
         System.out.println("--------Enter Your Details-------- ");  
         Scanner in = new Scanner(System.in);  
         System.out.print("Enter your name: ");    
         String name = in.next();   
         System.out.println("Name: " + name);           
         System.out.print("Enter your age: ");  
         int i = in.nextInt();  
         System.out.println("Age: " + i);  
         System.out.print("Enter your salary: ");  
         double d = in.nextDouble();  
         System.out.println("Salary: " + d);         
         in.close();  
	}
	
	public static void scannerFile() {
		File file = new File("C:\\Users\\sandh_ctyq64n\\eclipse-workspace\\javapractice\\src\\classPractice\\mydata");

	    try {

	        Scanner sc = new Scanner(file);

	        while (sc.hasNextLine()) {
	            String i = sc.next();
	            System.out.println(i);
	        }
	        sc.close();
	    } 
	    catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }
	}
}
