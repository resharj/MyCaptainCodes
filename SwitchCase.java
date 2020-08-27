package switchCase;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		System.out.println("Input choice:1, 2 or 3");
		Scanner s=new Scanner(System.in);
		choice=s.nextInt();
		switch(choice) {
		case 1 : System.out.println("You said Hi.");
		break;
		case 2 : System.out.println("You said Hey.");
		break;
		case 3 : System.out.println("You said Hello.");
		break;
		default : System.out.println("Invalid choice");
		}
	}

}
