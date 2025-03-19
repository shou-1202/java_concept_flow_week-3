import java.util.Scanner;//importing scanner
class CalculatorUsingSwitchCase{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);//opening scanner object
	System.out.println("Enter a number: ");// reading input from the user
    int first = input.nextInt();
	System.out.println("Enter a number: ");// reading input from the user
    int second = input.nextInt();
	input.nextLine();
	System.out.println("Enter the operation: (+,-,*,/)");// reading input from the user
    String op = input.nextLine();
	switch(op){
	case "+":
	    System.out.println("Addition: "+(first+second));
		break;
	case "-":
	    System.out.println("Subtraction: "+(first-second));
		break;
	case "*":
	    System.out.println("Multiplication: "+(first*second));
		break;
	case "/":
	    System.out.println("Division: "+(first/second));
		break;
	default:
	    System.out.println("Invalid Operator");
	}
  }
}