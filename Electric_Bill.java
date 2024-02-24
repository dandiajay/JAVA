package ATM;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
public class Electric_Bill {

	public static void main(String[] args) {
		System.out.println("please enter units");
		Scanner sc=new Scanner(System.in);
		
		//less than 100 unit
		int unit=sc.nextInt();
		if(unit>0 && unit<=100) {
			double energy_Charge=unit*1.20;
			double Gst=10.5;
			double fixed_Charge=25;
			double Total=energy_Charge+Gst+fixed_Charge;
			System.out.println("------------------------");
			LocalDate obj1=LocalDate.now();
			LocalTime obj2=LocalTime.now();
			System.out.println("Date"+obj1);
			System.out.println("Time"+obj2);
			System.out.println("Units:"+unit+"     "+"Days:29");
			System.out.println("GST:"+Gst);
			System.out.println("Fixed_Charge:"+fixed_Charge);
			System.out.println("------------------------");
			System.out.println("Total-Charge:"+Total);
			
			System.out.println("------------------------");
			
			
			//greater-than 100 & less-than 200
	}else if(unit>100 && unit<=200) {
		double energy_Charge=unit*2.0;
		double Gst=15.5;
		double fixed_Charge=30;
		double Total=energy_Charge+Gst+fixed_Charge;
		System.out.println("------------------------");
		//display Date & Time
		LocalDate obj1=LocalDate.now();
		LocalTime obj2=LocalTime.now();
		System.out.println("Date"+obj1);
		System.out.println("Time"+obj2);
		System.out.println("");
		//display units & Days
		System.out.println("Units:"+unit+"     "+"Days:29");
		//display Gst
		System.out.println("GST:"+Gst);
		//display fixed	//display fixex-charge-charge
		System.out.println("Fixed_Charge:"+fixed_Charge);
		//display Total
		System.out.println("------------------------");
		System.out.println("Total-Charge:"+Total);
		System.out.println("------------------------");
		
		
		//greater-than 200 & less-than 300
	}else if(unit>200 && unit<=300) {
		double energy_Charge=unit*3.0;
		double Gst=20.5;
		double fixed_Charge=35;
		double Total=energy_Charge+Gst+fixed_Charge;
		System.out.println("------------------------");
		//display Date & Time
		LocalDate obj1=LocalDate.now();
		LocalTime obj2=LocalTime.now();
		System.out.println("Date"+obj1);
		System.out.println("Time"+obj2);
		System.out.println("");
		//display units & Days
		System.out.println("Units:"+unit+"     "+"Days:29");
		//display Gst
		System.out.println("GST:"+Gst);
		//display fixed-charge
		System.out.println("Fixed_Charge:"+fixed_Charge);
		//display Total
		System.out.println("------------------------");
		System.out.println("Total-Charge:"+Total);
		System.out.println("------------------------");
		
		
		//greater-than 300
	}else if(unit>300) {
		double energy_Charge=unit*4.0;
		double Gst=25.5;
		double fixed_Charge=40;
		double Total=energy_Charge+Gst+fixed_Charge;
		System.out.println("------------------------");
		//display Date & Time
		LocalDate obj1=LocalDate.now();
		LocalTime obj2=LocalTime.now();
		System.out.println("Date"+obj1);
		System.out.println("Time"+obj2);
		System.out.println("");
		//display units & Days
		System.out.println("Units:"+unit+"     "+"Days:29");
		//display Gst
		System.out.println("GST:"+Gst);
		//display fixed-charge
		System.out.println("Fixed_Charge:"+fixed_Charge);
		//display Total
		System.out.println("------------------------");
		System.out.println("Total-Charge:"+Total);
		System.out.println("------------------------");
}
}
}