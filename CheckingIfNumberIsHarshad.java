import java.util.Scanner;//importing scanner
class CheckingIfNumberIsHarshad{
    public static void main(String[] args){
	int number1,number2, sum= 0;
	Scanner input = new Scanner(System.in);//opening scanner object
	System.out.println("Enter a number: ");// reading input from the user
    int number = input.nextInt();
	number1 = number;//assigning value of number to another variable for operation
	while(number1!=0){
		number2  = number1%10;
		sum += number2;
		number1 = number1/10;
	}
	if(number%sum==0){
		System.out.println("Number is a Harshad number");
	}
	else{
		System.out.println("Number is not a Harshad number");
	}
  }
}