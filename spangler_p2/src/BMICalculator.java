import java.util.Scanner;
import java.lang.Math;

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
	
	private String weight, height, choice, BmiCategory;
	private double Bmi;
	Scanner kb = new Scanner(System.in);
	
	
	public void readUserData() {
		while (true) {
			try {
				readUnitType();
				break;
			} catch (Exception e) {
				System.out.println("Enter a valid input!\n");
			}
		}
		
		readMeasurementData();
	}
	
	private void readUnitType() {
		
		
		while (true) {
			System.out.println("Enter 1 for Imperial");
			System.out.println("Enter 2 for Metric");
			this.choice = kb.nextLine();
			if (Integer.parseInt(this.choice) == 1 || Integer.parseInt(this.choice) == 2) {
				break;
			}
			System.out.println("Enter a valid input!\n");
		}
		
	}
	
	private void readMeasurementData() {
		if (Integer.parseInt(this.choice) == 1) {
			readImperialData();
		}
		else if (Integer.parseInt(this.choice) == 2) {
			readMetricData();
		}
	}
	
	private void readMetricData() {
		System.out.print("Enter your weight in kilograms: ");
		setWeight(kb.nextLine());
		if (Double.parseDouble(getWeight()) <= 0) {
			System.exit(0);
		}
		
		System.out.print("Enter your height in meters: ");
		setHeight(kb.nextLine());
		if (Double.parseDouble(getHeight()) <= 0) {
			System.exit(0);
		}

	}
	
	private void readImperialData() {
		System.out.print("Enter your weight in pounds: ");
		setWeight(kb.nextLine());
		if (Double.parseDouble(getWeight()) <= 0) {
			System.exit(0);
		}

		
		System.out.print("Enter your height in inches: ");
		setHeight(kb.nextLine());
		if (Double.parseDouble(getHeight()) <= 0) {
			System.exit(0);
		}

	}
	
	public void calculateBmi() {
		if (Integer.parseInt(this.choice) == 1) {
			Bmi = (703 * (Double.parseDouble(getWeight()))) / (Math.pow((Double.parseDouble(getHeight())), 2));
		}
		else if (Integer.parseInt(this.choice) == 2) {
			Bmi = (Double.parseDouble(getWeight())) / (Math.pow((Double.parseDouble(getHeight())), 2));
		}
		calculateBmiCategory();
	}
	
	private void calculateBmiCategory() {
		
		if (Bmi < 18.5) {
			BmiCategory = "Underweight";
		}
		else if (Bmi >= 18.5 && Bmi <= 24.9) {
			BmiCategory = "Normalweight";
		}
		else if (Bmi >= 25 && Bmi <= 29.9) {
			BmiCategory = "Overweight";
		}
		else if (Bmi >= 30) {
			BmiCategory = "Obesity";
		}
		
		
	}
	
	public void displayBmi() {
		System.out.printf("Your BMI is: %.1f\n", getBmi());
		System.out.println("BMI Categories: ");
		System.out.println("\tUnderweight: BMI < 18.5");
		System.out.println("\tNormalweight: 18.5 <= BMI <= 24.9");
		System.out.println("\tOverweight: 25 <= BMI <= 29.9");
		System.out.println("\tObesity: BMI >= 30");
		System.out.println("Your category is: " + getBmiCategory());
	}
	
	public String getWeight() {
		return weight;
	}
	
	private void setWeight(String newWeight) {
		this.weight = newWeight;
	}
	
	public String getHeight() {
		return height;
	}
	
	private void setHeight(String newHeight) {
		this.height = newHeight;
	}
	
	public double getBmi() {
		return Bmi;
	}
	
	public String getBmiCategory() {
		return BmiCategory;
	}
	
	
}
