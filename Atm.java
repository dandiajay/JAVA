package ATM;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
public class Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pin=1234;
		int balance=2000;
		int deposite;
		int withdraw;
		
		while(true) {
			
			System.out.println("Welcome to ATM");
			System.out.println("1.with-draw");
			System.out.println("2.Deposite");
			System.out.println("3.balance");
			System.out.println("4.exit");
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			
			switch(num) {
			case 1:System.out.println("withdraw");
			 System.out.println("please enter your pin");
			int pin1=sc.nextInt();
//			To check the pin
		while(pin!=pin1) {
				System.out.println("valid pin");
				System.out.println("please enter correct pin");
			pin1=sc.nextInt();

			}
			if(pin1==pin) {
				System.out.println("please enter amount to with-draw");
				withdraw=sc.nextInt();
				if(balance>=withdraw) {
					balance=balance-withdraw;
					System.out.println("------------------------------------");
					System.out.println("please collect your amount="+withdraw);
					System.out.println("Current balance:"+balance);
					System.out.println("------------------------------------");
				
						
				}
				else
					System.out.println("insufficient balance");
			} break;
				
				//case 2: deposite
				case 2:System.out.println("------------------------------------");
					System.out.println("please  deposite amount");
				deposite=sc.nextInt();
				balance=balance+deposite;
				System.out.println("------------------------------------");
				break;
				
				//case 3: current balance
				case 3:System.out.println("------------------------------------");
					System.out.println("Current balance:"+balance);
					System.out.println("Do you want Receipt press 1");
					int rec=sc.nextInt();
					switch(rec) {
					case 1:LocalDate obj1=LocalDate.now();
					LocalTime obj2=LocalTime.now();
					System.out.println("------------------------------------");
					System.out.println("Date"+obj1);
					System.out.println("Time"+obj2);
					System.out.println("Current balance:"+balance);
					
					}
					System.out.println("------------------------------------");
				break;
				
				// case 4: exit
				case 4:System.out.println("------------------------------------");
				System.out.println("Visit Again");
				System.out.println("------------------------------------");
				System.exit(0);
				break;
				
				
				
			}

		}
		}
		
	}
	
			