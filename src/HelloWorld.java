<<<<<<< HEAD
=======

import java.util.Scanner;
>>>>>>> refs/heads/HelloUser
public class HelloWorld {

	public static void main(String[] args) {
<<<<<<< HEAD
		// TODO Auto-generated method stub
		System.out.println("Hello ASE2017 - How are you now? :)");
=======
		
		System.out.println("Hello ASE2017 - How are you? :)");
		
		System.out.println("Please enter your Name: ");
		
		Scanner in= new Scanner(System.in);
		
		String userName = in.nextLine();
		
		HelloUser HelloUser= new HelloUser(userName);
		HelloUser.greetUser();
>>>>>>> refs/heads/HelloUser
	}

}

