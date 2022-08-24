package classPractice;

public class ClasspracticeInheretance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SUV cr = new SUV();
		cr.door=2;
		cr.tyres=4;
		cr.Model="Honda";
		cr.seat=7;
		cr.printCar();
		//cr.printCarSUV();

	}

}

class car2{
	int tyres=0;
	int door=0;
	String Model="";
	
	public void printCar() {
		System.out.println("Tyres :"+ tyres);
		System.out.println("Doors :"+ door);
		System.out.println("Model :"+ Model);
	}
	
}

class SUV extends car2{
	int seat=0;
	
	public void printCar() {
		System.out.println("Tyres :"+ tyres);
		System.out.println("Doors :"+ door);
		System.out.println("Model :"+ Model);
		System.out.println("Seat no :"+seat);
	}

	
	
}