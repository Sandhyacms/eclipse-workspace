package classPractice;

public class ClassPractice11 {

	public static void main(String[] args) {
		san s=new san("sandhya");
		s.pintname();

	}

}
class san{
	String name="";
	san(String a){
		name=a;
	}

public void pintname() {
	System.out.println("Hello "+ name +", "+"How are you ?");
}
	
}