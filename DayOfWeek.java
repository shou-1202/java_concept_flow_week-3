import java.util.Scanner;//importing scanner
class DayOfWeek{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);//opening scanner object
	System.out.println("Enter month: ");// reading input from the user
    int m = input.nextInt();
	System.out.println("Enter day: ");// reading input from the user
    int d = input.nextInt();
	System.out.println("Enter year: ");// reading input from the user
    int y = input.nextInt();
	int y0 = y - (14 - m) / 12;
    int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
    int m0 = m + 12 * ((14 - m) / 12) - 2;
    int d0 = (d + x + 31 * m0 / 12) % 7;
	if (d0 == 0) {
      System.out.println("Sunday");
    } 
	else if (d0 == 1) {
      System.out.println("Monday");
    } 
	else if (d0 == 2) {
      System.out.println("Tuesday");
    } 
	else if (d0 == 3) {
      System.out.println("Wednesday");
    } 
	else if (d0 == 4) {
      System.out.println("Thursday");
    } 
	else if (d0 == 5) {
      System.out.println("Friday");
    } 
	else if (d0 == 6) {
      System.out.println("Saturday");
    }
  }
}