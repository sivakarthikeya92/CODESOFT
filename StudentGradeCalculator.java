import java.text.DecimalFormat;
import java.util.Scanner;

public class StudentGradeCalculator {
	public static void main(String[] args) throws Exception{
		try {
		int totalMarks = 300; // 300 because i have taken 3 subjects
		int totalMarksGained;
		double averagePercentage;
		String Grade;
		
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks out of 100 for each subjects");
		
		System.out.print("Enter Marks for Subject 1 : ");
		int subject1_Marks = sc.nextInt();
		
		if(subject1_Marks>100) {
			System.out.println("Please Enter Valid Marks.");
			break;
		}
		
		System.out.print("Enter Marks for Subject 2 : ");
		int subject2_Marks = sc.nextInt();
		
		if(subject2_Marks>100) {
			System.out.println("Please Enter Valid Marks.");
			break;
		}
		
		System.out.print("Enter marks For Subject 3 : ");
		int subject3_Marks = sc.nextInt();
		
		if(subject2_Marks>100) {
			System.out.println("Please Enter Valid Marks.");
			break;
		}
		
		totalMarksGained = subject1_Marks + subject2_Marks + subject3_Marks;
	
		averagePercentage = ((double) totalMarksGained/totalMarks)*100;
		
			if (averagePercentage > 90) {
				Grade = "A+";
			}
			else if(averagePercentage > 80 && averagePercentage <= 90 ) {
				Grade = "A";
			}
			else if (averagePercentage > 70 && averagePercentage <= 80) {
				Grade = "B+";
			}
			else if (averagePercentage > 60 && averagePercentage <= 70) {
				Grade = "B";
			}
			else if (averagePercentage > 50 && averagePercentage <= 60) {
				Grade = "C";
			}
			else if (averagePercentage > 40 && averagePercentage <= 50) {
				Grade = "D";
			}
			else {
				Grade = "F";
			}
			DecimalFormat average = new DecimalFormat("0.00");
			String formattedPercentage = average.format(averagePercentage);
		
		System.out.println("------Results------");
		System.out.println("Total Marks : "+totalMarksGained);
		System.out.println("Average Percentage : "+formattedPercentage);
		System.out.println("Grade "+Grade);
		break;
		}
		}catch(java.util.InputMismatchException e) {
			System.out.println("Enter Valid Marks");
		}
		
	}
}
