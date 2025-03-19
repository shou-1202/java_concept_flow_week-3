import java.util.Scanner;//importing scanner
class CountingNumberOfDigits{
    public static void main(String[] args){
	int number1, digits = 0;// instantiating variables
	Scanner input = new Scanner(System.in);//opening scanner object
	System.out.println("Enter a number: ");// reading input from the user
	int number = input.nextInt();
	while(number!=0){
		number = number/10;
		digits++;//counting the digits
	}
	System.out.println("The number of digits is "+digits);
	input.close();//closing scanner object
  }
}