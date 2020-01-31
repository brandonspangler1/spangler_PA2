import java.util.Scanner;

/*
 * allow user to select type
 * 		prompt until valid input
 * read in user weight and height
 * 		exit if negative weight or height
 * calculates BMI
 * 		use correct formula
 * display BMI categories and values
 * 		data from National Heart Lung and Blood Institute
 * 
 */



public class BMICalculator {

	public static void main(String[] args) {
			BMICalculator app = new BMICalculator();
		    app.readUserData();
		    app.calculateBmi();
		    app.displayBmi();
	}
	
	String weight, height;
	Scanner kb = new Scanner(System.in);
	
	
	public void readUserData() {
		String choice = readUnitType();
		readMeasurementData(choice);
	}
	
	private String readUnitType() {
		
		String choice;
		
		while (true) {
			System.out.println("Enter 1 for Imperial");
			System.out.println("Enter 2 for Metric");
			choice = kb.nextLine();
			if (Integer.parseInt(choice) == 1 || Integer.parseInt(choice) == 2) {
				break;
			}
		}
		
		return choice;
	}
	
	private void readMeasurementData(String choice) {
		if (Integer.parseInt(choice) == 1) {
			readImperialData();
		}
		else if (Integer.parseInt(choice) == 2) {
			readMetricData();
		}
	}
	
	private void readMetricData() {
		System.out.print("Enter your weight in kilograms: ");
		this.weight = kb.nextLine();
		if (Double.parseDouble(weight) <= 0) {
			System.exit(0);
		}
		
		System.out.print("Enter your height in meters: ");
		this.height = kb.nextLine();
		if (Double.parseDouble(height) <= 0) {
			System.exit(0);
		}

	}
	
	private void readImperialData() {
		System.out.print("Enter your weight in pounds: ");
		this.weight = kb.nextLine();
		if (Double.parseDouble(weight) <= 0) {
			System.exit(0);
		}

		
		System.out.print("Enter your height in inches: ");
		this.height = kb.nextLine();
		if (Double.parseDouble(height) <= 0) {
			System.exit(0);
		}

	}
	
	public void calculateBmi() {
		calculateBmiCategory();
	}
	
	private void calculateBmiCategory() {
		
	}
	
	public void displayBmi() {
		
	}
	
	public double getWeight() {
		return weight;
	}
	
	private void setWeight() {
		
	}
	
	public double getHeight() {
		return height;
	}
	
	private void setHeight() {
		
	}
	
	public double getBmi() {
		return Bmi;
	}
	
	public String getBmiCategory() {
		return BmiCategory;
	}
	
	
}
