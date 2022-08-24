package classPractice;

public class ClassPractice8 {

	public static void main(String[] args) {
		student1 s=new student1("sandhya",55);
		s.printstudent();

	}

}
class student1{
	String name="";
	int marks=0;
	
	student1(String nm,int ma){
	name=nm;
	marks=ma;
	}
	
	public void printstudent() {
		if(marks>45) {
		System.out.println("you passed");	
		}
		else {
			System.out.println("you failed");
		}
		}
	}
