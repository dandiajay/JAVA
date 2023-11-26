package ATM;
import java.util.*;

public class Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance=3000,withdraw,deposite,num;
		int pin=12345;
	Scanner sc=new Scanner(System.in);
	while(true) {
		System.out.println("welcome to ATM");
		System.out.println("1.withdraw");
		System.out.println("2.Deposite");
		System.out.println("3.check balance");
		System.out.println("4.exit");
		num=sc.nextInt();
		switch(num){
		case 1:System.out.println("please enter your pin");
			int pin1=sc.nextInt();
			while(pin1!=pin) {
			System.out.println("re-enter correct pin");
			pin1=sc.nextInt();
			}
			if( pin1==pin ) {
				

			System.out.println("withdraw");
		withdraw=sc.nextInt();
		if(balance>=withdraw) {
			balance=balance-withdraw;
			System.out.println("balanceis:"+balance);
			System.out.println("please collect your money");
		}
			
		else
			System.out.println("not having enought balance");
			}
			
			
		
			//System.out.println("");
			break;
		case 2:System.out.println("please Deposite");
		deposite=sc.nextInt();
		balance=balance+deposite;
		System.out.println("balance is:"+balance);
		//System.out.println("");
		break;
		case 3:System.out.println("balance:"+balance);
		//System.out.println("");
		break;
		case 4:System.exit(0);
		//System.out.println("");
		
		}
	}
	

	}

}
