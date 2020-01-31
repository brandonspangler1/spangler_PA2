import java.util.Scanner;

/*
 * scan four digit number from user
 * encrypt number
 * 		call encrypter
 * decrypt number
 * 		call decrypter
 */


public class Application {
	
	public static void main(String[] args) {
		
		Encrypter num = new Encrypter();
		
		Scanner kb = new Scanner(System.in);
		String choice;
		
		while(true) {
			System.out.println("What would you like to do?");
			System.out.println("\tEnter 1 for encryter");
			System.out.println("\tEnter 2 for decrypter");
			System.out.println("\tEnter 3 to exit");
			
			choice = kb.nextLine();
			
			if (Integer.parseInt(choice) == 1) {
				num.doEncryption();
			}
			else if (Integer.parseInt(choice) == 2) {
				
			}
			else if (Integer.parseInt(choice) == 3) {
				break;
			}
		}
		
		kb.close();
	}

}
