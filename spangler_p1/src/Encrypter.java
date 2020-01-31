import java.util.Scanner;

/*
 * Pseudocode
 * scan four digit number from user
 * encrypt each digit
 * 		add 7 to each number
 * 		get remainder after dividing by 10
 * 		swap first with third 
 * 		swap second with fourth
 * print encrypted number
 *  
 */


public class Encrypter {

	
	public void encrypt(int ENCRYPTIONLENGTH) {
	
		Scanner num = new Scanner(System.in);
		String numToEncrypt;
		
		//check if input valid
		while(true) {
			
			System.out.print("Enter your number: ");
			numToEncrypt = num.nextLine();
			
			if (numToEncrypt.length() > ENCRYPTIONLENGTH || numToEncrypt.length() < ENCRYPTIONLENGTH || numToEncrypt.charAt(0) == '-') {
				System.out.println("Enter a vaild " + ENCRYPTIONLENGTH + " digit number!");
				numToEncrypt = null;
				continue;
			}

			try {
				Integer.parseInt(numToEncrypt);
			} catch (Exception e) {
				System.out.println("Enter a vaild " + ENCRYPTIONLENGTH + " digit number!");
				numToEncrypt = null;
				continue;
			}
			
			if (numToEncrypt != null) {
				break;
			}
			
		}
		System.out.print("\n");
		
		//converts to ints
		int nums[] = new int[ENCRYPTIONLENGTH];
		
		for(int i = 0; i < ENCRYPTIONLENGTH; i++) {
			nums[i] = Integer.parseInt(String.valueOf(numToEncrypt.charAt(i)));
		}
		
		//add 7
		for (int i = 0; i < ENCRYPTIONLENGTH; i++) {
			nums[i] += 7;
		}
		
		//mod 10
		for (int i = 0; i < ENCRYPTIONLENGTH; i++) {
			nums[i] = nums[i]%10;
		}
		
		
		//swap values
		int temp;
		
		for (int i = 0; i < ENCRYPTIONLENGTH/2; i++) {
			temp = nums[i];
			nums[i] = nums[i+2];
			nums[i+2] = temp;
		}
		
		
		System.out.print("Your encrypted number is: ");
		for(Integer x : nums) {
			System.out.print(x);
		}
		System.out.print("\n\n");
	
	}
	
}
