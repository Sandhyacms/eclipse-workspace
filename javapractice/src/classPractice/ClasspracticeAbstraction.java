package classPractice;

public class ClasspracticeAbstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
car4 car=new car4();
car.drive();

	}

}

abstract class Vehicle{
	public abstract void drive();
	
}

class car4 extends Vehicle{
	public void drive() {
		System.out.println("Testing");
	}
}
