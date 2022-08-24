

abstract class Animal2{
   //abstract method
   public abstract void sound();
   public abstract void test();
   public void newSound() {
	   System.out.println("Testing sound");
   }
}


//Dog class extends Animal class
public class Dog_Abstract extends Animal2{

   public void sound(){
	System.out.println("Woof");
	test();
   }
   public void test() {
	   newSound();
   }
   public static void main(String args[]){
	Animal2 obj = new Dog_Abstract();
	obj.sound();
	
   }
}


