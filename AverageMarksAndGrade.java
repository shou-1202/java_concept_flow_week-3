import java.util.Scanner;//importing scanner
class AverageMarksAndGrade{
    public static void main(String[] args){
	String grade, remarks;// instantiating variables
	Scanner input = new Scanner(System.in);//opening scanner object
	System.out.println("Enter marks for physics: ");// reading input from the user
	double physicsMarks = input.nextDouble();
	System.out.println("Enter marks for chemistry: ");// reading input from the user
	double chemistryMarks = input.nextDouble();
	System.out.println("Enter marks for maths: ");// reading input from the user
    double mathsMarks = input.nextDouble();
	double percentage = (physicsMarks+chemistryMarks+mathsMarks)/3;//calculating average
	System.out.println("Average Marks: "+percentage);
	if(percentage>=80){//if else for grade and remarks classifictaion
		grade = "Level-4";
		remarks = "Above agency normalized standards";
		System.out.println("Grade: "+grade);//printing grade
	    System.out.println("Remarks: "+remarks);//printing remarks
	}
	else if ((percentage>=70)&&(percentage<=79)){
		grade = "Level-3";
		remarks = "Agency normalized standards";
		System.out.println("Grade: "+grade);//printing grade
	    System.out.println("Remarks: "+remarks);//printing remarks
	}
	else if((percentage>=60)&&(percentage<=69)){
		grade = "Level-2";
		remarks = "Approaching agency normalized standards";
		System.out.println("Grade: "+grade);//printing grade
	    System.out.println("Remarks: "+remarks);//printing remarks
	}
	else if((percentage>=50)&&(percentage<=59)){
		grade = "Level-1";
		remarks = "Well below agency normalized standards";
		System.out.println("Grade: "+grade);//printing grade
	    System.out.println("Remarks: "+remarks);//printing remarks
	}
	else if((percentage>=40)&&(percentage<=49)){
		grade = "Level-0";
	    remarks = "Too below agency normalized standards";
		System.out.println("Grade: "+grade);//printing grade
	    System.out.println("Remarks: "+remarks);//printing remarks
	}
    else if(percentage<=39){
        grade = "NO level";
		remarks = "Remedial standards";
        System.out.println("Grade: "+grade);//printing grade
	    System.out.println("Remarks: "+remarks);//printing remarks		
	}
	}
}