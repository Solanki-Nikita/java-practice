// Two dimensional array 

import java.util.Scanner;
public class Ar2 {
	int a[][] = new int [2][2];
	int i ,j;
	Scanner ip;
	void set() {
		ip = new Scanner(System.in);
		System.out.println("Enter the array element");
		for (i=0;i<=1;i++)
		{
		   for (j=0;j<=1;j++) 
		   {
			 a[i][j] = ip.nextInt();
		   }
	    }
	}
   void show(){
	   System.out.println("the array element\n");
	   for (i=0;i<=1;i++){
		   for (j=0;j<1;j++) {
			   System.out.println(a[i][j]+"\t");
		   }
		   System.out.println(" ");
	   }
	}
	public static void main(String[] args) {
	Ar2 ob = new Ar2();
	ob.set();
	ob.show();
	}
}
