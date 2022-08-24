package classPractice;

public class ClassPactice2 {

	public static void main(String[] args) {
		car c1=new car();
		c1.color="red";
		
		c1.modelname="honda";
		c1.displaycar();
		car c2=new car();
		c2.color="black";
		c2.modelname="toyota";
		c2.displaycar();

	}

}

class car {
	String modelname = "";
	String color = "";

	public void displaycar() {
		System.out.println("you have " + color+" colored "+modelname);
		
		
	}

}