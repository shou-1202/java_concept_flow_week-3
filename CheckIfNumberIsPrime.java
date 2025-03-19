import java.util.Scanner;//importing scanner
class CheckIfNumberIsPrime{
    public static void main(String[] args){
	boolean isPrime = true;// instantiating variables
	Scanner input = new Scanner(System.in);//opening scanner object
	System.out.println("Enter a number: ");// reading input from the user
	int number = input.nextInt();
	for(int i =2;i<=((number/2));i++){
		if((number==2)||(number==3)){
			isPrime = true;
		}
		else if(number%i==0){
			isPrime = false;
			break;
		}
	}
	if(isPrime==true){
		System.out.println("Number is prime");
	}
	else{
		System.out.println("Number is not prime");
	}
  }
}