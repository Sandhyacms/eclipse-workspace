package classPractice;

public class ClassPractice {

	public static void main(String[] args) {
		student std1 = new student();
		std1.firstname = "sandhya";
		std1.lastname = "kumari";
		std1.age = 35;
		std1.printStudent();
	}
}

class student {
	String firstname = "";
	String lastname = "";
	int age = 0;
	
	public void printStudent() {
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(age);
	}
	
	
}
