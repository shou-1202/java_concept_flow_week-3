import java.util.Scanner;//importing scanner
class LeapYear{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);//opening scanner object
	System.out.println("Enter year: ");// reading input from the user
	int year = input.nextInt();
	if((year%4==0)&&(year%100!=0)||(year%400==0)){
		System.out.println("It is a Leap Year");
	}
	else{
		System.out.println("It is not a Leap Year");
	}
	}
}