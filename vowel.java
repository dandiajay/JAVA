package Tmf;

import java.util.Scanner;

public class vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("enter the vowel and constant");
//		Scanner sc= new Scanner(System.in);
//		String name=sc.nextLine();
		String str=new String("welcome to arts college");
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				System.out.println(str.charAt(i)+" - is a vowel");
			}else if(str.charAt(i)=='a' && str.charAt(i)=='z') {
				System.out.println(str.charAt(i)+" - it is a consonent");
			}
			else if(str.charAt(i)==' '){
				System.out.println("it is a space");
			}
		}

	}

}
