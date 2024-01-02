/// program to print duplicate number 

import java.util.Scanner;
public class DP {
	int a[] = new int [5];
	int i,j;
    void set() {
    	Scanner ip = new Scanner(System.in); 
    	System.out.println("Enter the array element");
    	for (i=0;i<=4;i++) {
    		a[i] = ip.nextInt();
    	}
    }
    void show() {
    	System.out.println("Element");
    	for (i=0;i<a.length;i++) {
    		for (j=i+1;j<a.length;j++) {
    			if (a[i]==a[j]);
    		}
    		System.out.println(a[j]);
    	}
    }
	public static void main(String[] args) {
		DP ob = new DP();
		ob.set();
		ob.show();
		}
	}
