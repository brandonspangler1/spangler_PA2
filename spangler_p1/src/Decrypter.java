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
		
		int[] nums = convertToInt(numToDecrypt, ENCRYPTIONLENGTH);
		
		nums = swap(nums);
		
		nums = undoMod10(nums, ENCRYPTIONLENGTH);
		
		
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
	
	
	public int[] convertToInt(String numToDecrypt, int ENCRYPTIONLENGTH) {
		int nums[] = new int[ENCRYPTIONLENGTH];
		
		for (int i = 0; i < ENCRYPTIONLENGTH; i++) {
			nums[i] = Integer.parseInt(String.valueOf(numToDecrypt.charAt(i)));
		}
		
		return nums;
	}
	
	public int[] swap(int[] nums) {
		int temp; 
		
		temp = nums[0];
		
		nums[0] = nums[2];
		
		nums[2] = temp;
		
		temp = nums[1];
		
		nums[3] = nums[1];
		
		nums[1] = temp;
		
		return nums;
	}
	
	public int[] undoMod10(int[] nums, int ENCRYPTIONLENGTH) {
		
		for(int i = 0; i < ENCRYPTIONLENGTH; i++) {
			nums[i] = nums[i] + 10;
			nums[i]
		}
		
		return nums;
	}
	
	
	
	
	
}
