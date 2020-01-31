import java.util.Scanner;

/*
 * Reverse Encryption
 * 		swap second with fourth
 * 		swap first with third
 * 		undo mod 10
 * 		subtract 7 to each number
 * print decrypted number
 */


public class Decrypter {
	
	public void doDecryption(int ENCRYPTIONLENGTH) {
		
		String numToDecrypt = getDecryptionNumFromUser(ENCRYPTIONLENGTH);
		
		
		
		
	}
	
	public String getDecryptionNumFromUser(int ENCRYPTIONLENGTH) {
		Scanner num = new Scanner(System.in);
		String numToDecrypt;
		
		while(true) {
			
			System.out.println("Enter your number: ");
			numToDecrypt = num.nextLine();
			
			if (numToDecrypt.length() > ENCRYPTIONLENGTH || numToDecrypt.length() < ENCRYPTIONLENGTH || numToDecrypt.charAt(0) == '-') {
				System.out.println("Enter a vaild " + ENCRYPTIONLENGTH + " digit number!");
				numToDecrypt = null;
				continue;
			}

			try {
				Integer.parseInt(numToDecrypt);
			} catch (Exception e) {
				System.out.println("Enter a vaild " + ENCRYPTIONLENGTH + " digit number!");
				numToDecrypt = null;
				continue;
			}
			
			if (numToDecrypt != null) {
				break;
			}
			
		}
		
		return numToDecrypt;
	}
	
	
	
}
