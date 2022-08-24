package javapractice;

public class Practiceswitch {

	public static void main(String[] args) {
		int day=2;
		String dayString;
		switch(day){
		case 1:
			dayString = "Monday";
			break;
		case 2:
			dayString="Tuesday";
			break;
		case 3:
			dayString = "Wednesday";
			break;
		case 4:
			dayString="Thursday";
			break;
		case 5:
			dayString="friday";
			break;
		case 6:
			dayString = "Saturday";
			break;
		case 7:
			dayString="Sunday";
			break;
		default:
			dayString="Invalidday";
		}
			
			System.out.println(dayString);
			
				
			
		
		

	}

}
