//Addition of 2D array :-
import java.util.Scanner;
class A1 {
	int a[][] = new [2][2];
	int b[][] = new [2][2];
	int c[][] = new [2][2];
	int i ,j;
	Scanner ip;
	void set() {
		ip = new Scanner(System.in);
		System.out.println("Enter the array element of matric A");
		for(i=0;i<=1;i++) {
			a[i][j]=ip.nextInt();
		}
	
	        System.out.println("Enter the element of matric B");
	          for(i=0;i<=1;i++) {
	        	  for (j=0;j<=1;j++) {
	        		  b[i][j]=ip.nextInt();
	        	  }
            }
	}
	void add() 
	{
		for (i=0;i<=1;i++) {
			for (j=0;j<=1;j++) {
				c[i][j]=a[i][j]+b[i][j];
			System.out.println(c[i][j]+"\t");
			}
			System.out.println(" ");
		}
	}
	public static void main(String[] args) {
		A1 ob = new A1();
		ob.set();
		ob.add();
	}
}
