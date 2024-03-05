package array;

import java.util.Scanner;

public class Student_marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String subject[]= {"Telugu","Hindi","English","Maths","Science","Social"};
		int marks[]=new int[6];
		int total=0;
		double average;
		for(int i=0;i<subject.length;i++) {
			System.out.println("Enter the marks of "+subject[i]+" is");
			marks[i]=sc.nextInt();
			total+=marks[i];
		}
		System.out.println("Total marks are "+total);
		average=total/subject.length;
		System.out.println("Average is "+average);
		

	}

}
