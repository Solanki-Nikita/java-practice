import java.util.Scanner;
class EO {
 int no;
 void set() {
	 Scanner ip = new Scanner(System.in);
	 System.out.println("Enter the no");
	 no = ip.nextInt();
 }
 void cal() {
	  if (no % 2==0)
	  {
		  System.out.println("no is even");
	  }
	  else 
	  {
		  System.out.println("no is odd");
	  }
 }
	public static void main(String[] args) {
		EO ob = new EO();
		ob.set();
		ob.cal();
	}

}
