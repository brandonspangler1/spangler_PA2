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
		
		nums = swap(nums);
		
		System.out.println("Your encrypted number is: ");
		for(Integer x : nums) {
			System.out.print(x);
		}
		System.out.print("\n");
	
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
	
	public int[] swap(int[] nums) {
		
		int temp;
		
		temp = nums[0];
		
		nums[0] = nums[2];
		
		nums[2] = temp;
		
		temp = nums[1];
		
		nums[1] = nums[3];
		
		nums[3] = temp;
		
		return nums;
	}
	
}
