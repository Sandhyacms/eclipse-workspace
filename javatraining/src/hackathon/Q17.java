package hackathon;

public class Q17 {
//WJP to find total number of integers, uppercase and lowercase character in the given string

	public static void main(String[] args) {

        String str = "WelomeToIndia2022";
        int upper = 0, lower = 0, number = 0; 
 
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                upper++;
            else if (ch >= 'a' && ch <= 'z')
                lower++;
            else if (ch >= '0' && ch <= '9')
                number++;
            
               
        }
 
        System.out.println("Lower case letters : " + lower);
        System.out.println("Upper case letters : " + upper);
        System.out.println("Number : " + number);
       

	}

}
