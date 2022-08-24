package classPractice;

public class ClassPractice5 {

	public static void main(String[] args) {
		name s=new name("sandhya ","kumari");
		s.printname();

	}

}

class name{
	String Firstname="";
	String Lastname="";
	
	name(String s,String k ){
		Firstname=s;
		Lastname=k;
	
	}
	void printname() {
		System.out.println(Firstname+Lastname);
}
}