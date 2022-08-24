package classPractice;

public class ClasspracticePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			SUV1 cr = new SUV1();
			cr.door=2;
			cr.tyres=4;
			cr.Model="Honda";
			cr.seat=7;
			cr.parentprintcar();
			//cr.printCarSUV();

		}

	}

	class car23{
		int tyres=0;
		int door=0;
		String Model="";
		
		public void printCar() {
			System.out.println("Tyres :"+ tyres);
			System.out.println("Doors :"+ door);
			System.out.println("Model :"+ Model);
		}
		
	}

	class SUV1 extends car23{
		int seat=0;
		int tyres=0;
		
		public void printCar() {
			System.out.println("Tyres :"+ tyres);
			System.out.println("Doors :"+ door);
			System.out.println("Model :"+ Model);
			System.out.println("Seat no :"+seat);
		}
		public void printCar(int i) {
			System.out.println("Tyres :"+ tyres);
			System.out.println("Doors :"+ door);
			System.out.println("Model :"+ Model);
			System.out.println("Seat no :"+seat);
		}
		
		public void parentprintcar() {
			super.printCar();
		}

}
