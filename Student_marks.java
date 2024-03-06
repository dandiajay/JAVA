package array;

import java.util.Scanner;

public class Student_marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String subject[] = { "Telugu", "Hindi", "English", "Maths", "Science", "Social" };
		int marks[] = new int[6];
		int total = 0;
		double average;
		String Grade = "";
		for (int i = 0; i < subject.length; i++) {
			System.out.println("Enter the marks of " + subject[i] + " is");
			marks[i] = sc.nextInt();
			total += marks[i];
//			check the marks of Grade
			if (marks[i] >= 90 && marks[i] < 100) {
				Grade = "O";
			} else if (marks[i] >= 80 && marks[i] < 90) {
				Grade = "A";
			} else if (marks[i] >= 70 && marks[i] < 80) {
				Grade = "B";
			} else if (marks[i] >= 60 && marks[i] < 70) {
				Grade = "C";
			} else if (marks[i] >= 50 && marks[i] < 60) {
				Grade = "D";
			} else if (marks[i] >= 35 && marks[i] < 50) {
				Grade = "E";
			} else if(marks[i]<35) {
				Grade = "F";
			}
		}

//		Check the condition fail
		boolean hasFailed = false;
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] <= 35) {
				hasFailed = true;
				break;
			} 
		}

		if (hasFailed) {
			System.out.println("----------------------------");
			System.out.println("Result  :   Fail            ");
			System.out.println("----------------------------");

		} else{
		System.out.println("----------------------------");
		System.out.println("Total marks are : " + total);
		average = total / subject.length;
		System.out.println("Average         : " + average);
		System.out.println("Grade           : " + Grade);
		System.out.println("Result          : Pass         ");
		System.out.println("----------------------------");
		}
	}

}
