

class Animal1{
   //abstract method
   public  void sound() {
	   System.out.println("Animal sound");
   }
   
   public void newSound() {
	   System.out.println("Testing sound");
   }
}


//Dog class extends Animal class
public class Dog_inheretance extends Animal1{

    
   public static void main(String args[]){
	Animal obj = new Dog_Abstract();
	obj.sound();
	
   }
}




