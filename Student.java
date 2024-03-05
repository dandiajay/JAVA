package method;

import java.util.Scanner;

class Ajay {
	String[] name;
    String[] course;
    String[] id;
	public void information() {
		
		    Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many student details:");
        int student_number = sc.nextInt();

        name = new String[student_number];
        course = new String[student_number];
        id = new String[student_number];
		

		 for (int i = 0; i < student_number; i++) {
	            Scanner sc1 = new Scanner(System.in);
	            System.out.println("Enter the name of student " + i + ":");
	            name[i] = sc1.nextLine();

	            System.out.println("Enter the course of student " + i + ":");
	            course[i] = sc1.nextLine();

	            System.out.println("Enter the id of student " + i + ":");
	            id[i] = sc1.nextLine();
	        }
	}
	
	 public void details() {
	        System.out.println("Student Information:");

	        for (int j = 0; j < course.length; j++) {
	            System.out.println("Name: " + name[j] + ", Course: " + course[j] + ", ID: " + id[j]);
	        }
	    }
   
	
	
	
	    }
    


public class Student {
    public static void main(String[] args) {
        Ajay ref = new Ajay();
        ref.information();
        ref.details();
    }
       
}



