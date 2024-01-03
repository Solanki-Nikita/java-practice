//Reverse Number

import java.util.Scanner;
abstract class Abs
{
	public abstract void set();
	public abstract void rev();
}
class Cabs extends Abs 
{
	 int no,r,sum;
	 Scanner ip;
	 Cabs() 
	 {
		 sum = 0;
		 ip = new Scanner (System.in);
	}
	 @Override
	 public void set() 
	 {
		 System.out.println("Enter the value of no");
		 no = ip.nextInt();
	 }
	 @Override
	 public void rev() 
	 {
		 while(no>0) {
			 r = no%10;
			 sum = sum*10+r;
			 no = no/10;
		 }
		 System.out.println("reverse no="+sum);
	 }

	public static void main(String[] args) {
		Cabs ob = new Cabs();
		ob.set();
		ob.rev();
	}

}
