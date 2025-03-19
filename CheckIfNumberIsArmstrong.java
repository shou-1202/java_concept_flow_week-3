import java.util.Scanner;//importing scanner
class CheckIfNumberIsArmstrong{
    public static void main(String[] args){
	int number1, number2, cube, sum = 0;// instantiating variables
	Scanner input = new Scanner(System.in);//opening scanner object
	System.out.println("Enter a number: ");// reading input from the user
	int number = input.nextInt();
	number1 = number;//assigning number to another variable for operations
	while(number1!=0){
		number2 = number1%10;//separating digits
		cube = number2*number2*number2;//taking cube of digit separated
		sum += cube;//adding the cube to sum variable
		number1 = number1/10;//updation condition
	}
	if(number==sum){//checking if both are same or not
		System.out.println("Number is Armstrong");
	}
	else{
		System.out.println("Number is not Armstrong");
	}
	input.close();//closing scanner object
  }
}