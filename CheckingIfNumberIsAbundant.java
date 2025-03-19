import java.util.Scanner;//importing scanner
class CheckingIfNumberIsAbundant{
    public static void main(String[] args){
	int number1,number2, sum= 0;
	Scanner input = new Scanner(System.in);//opening scanner object
	System.out.println("Enter a number: ");// reading input from the user
    int number = input.nextInt();
	number1 = number;//assigning value of number to another variable for operation
	for(int i =1;i<number;i++){//checking if number is abundant
		if(number%i==0){
			sum += i;//adding all the divisors
		}
	}
	if(sum>number){
		System.out.println("Number is a Abundant number");
	}
	else{
		System.out.println("Number is not a Abundant number");
	}
  }
}