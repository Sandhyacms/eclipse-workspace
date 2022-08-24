package salesforce;

import java.util.Arrays;
import java.util.List;


public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> messages = Arrays.asList("My Profile", "My Settings", "Developer Console", "Switch to Lightning Experience", "Logout");
		for (String str : messages) {
			System.out.println(str);
		}
		System.out.println(messages.contains("Switch to Lightning Experience"));
	}

}
