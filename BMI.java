import java.util.Scanner;//importing scanner
class BMI{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);//opening scanner object
	System.out.println("Enter weight in kg: ");// reading input from the user
    double weight = input.nextDouble();
	System.out.println("Enter height in cm: ");// reading input from the user
	double heightInCm = input.nextDouble();
	double heightInM = heightInCm/100;
	double bmi = weight/(heightInM*heightInM);
	if(bmi<=18.4){
		System.out.println("Underweight");
	}
	else if((bmi>18.4)&&(bmi<=24.9)){
		System.out.println("Normal");
	}
	else if((bmi>25)&&(bmi<=39.9)){
		System.out.println("Overweight");
	}
	else{
		System.out.println("Obese");
	}
  }
}