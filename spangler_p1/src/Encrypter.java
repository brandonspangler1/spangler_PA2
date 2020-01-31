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

	final int ENCRYPTIONLENGTH = 4;
	
	public void doEncryption() {
	
		String numToEncrypt = getNumFromUser();
		
		int nums[] = add7(numToEncrypt);
		
		nums = mod10(nums);
		
	
		
		
		
		for(Integer x : nums) {
			System.out.println(x);
		}
		
	
	}
	
	
	
	
	public String getNumFromUser() {
		Scanner num = new Scanner(System.in);
		String numToEncrypt;
		
		
		while(true) {
			
			System.out.println("Enter your number: ");
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
		
		return numToEncrypt;
	}
	
	public int[] add7(String numToEncrypt) {
		int nums[] = new int[ENCRYPTIONLENGTH];
		
		for (int i = 0; i < ENCRYPTIONLENGTH; i++) {
			nums[i] = Integer.parseInt(String.valueOf(numToEncrypt.charAt(i)));
			nums[i] += 7;
		}
		
		return nums;
	}
	
	public int[] mod10(int[] nums) {
		
		for (int i = 0; i < ENCRYPTIONLENGTH; i++) {
			nums[i] = nums[i]%10;
		}
		
		return nums;
		
	}
	
}
