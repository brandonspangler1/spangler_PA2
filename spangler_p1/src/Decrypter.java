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
	
	public void decrypt(int ENCRYPTIONLENGTH) {
		
		Scanner num = new Scanner(System.in);
		String numToDecrypt;
		
		//check if number is valid
		while(true) {
			
			System.out.print("Enter your number: ");
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
		System.out.print("\n");
		
		//convert number to ints
		int nums[] = new int[ENCRYPTIONLENGTH];
		
		for (int i = 0; i < ENCRYPTIONLENGTH; i++) {
			nums[i] = Integer.parseInt(String.valueOf(numToDecrypt.charAt(i)));
		}
		
		//swap numbers
		int temp;
		
		for (int i = 0; i < ENCRYPTIONLENGTH/2; i++) {
			temp = nums[i];
			nums[i] = nums[i+2];
			nums[i+2] = temp;
		}
		
		//unmod numbers and subtract 7
		for (int i = 0; i < ENCRYPTIONLENGTH; i++) {
			if((nums[i] - 7) < 0) {
				nums[i] = nums[i] + 10;
			}
			
			nums[i] = nums[i] - 7;
		}
		
		
		System.out.print("Your decrypted number is: ");
		for(Integer x : nums) {
			System.out.print(x);
		}
		System.out.print("\n\n");
		
	}

}
