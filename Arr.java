///One Dimension Array/ Number Found:-

import java.util.Scanner;
public class Arr {
    int a[]=new int [5];
    int i;
    //int no ;
    void set() {
    	Scanner ip = new Scanner (System.in);
    	System.out.println("Enter the array element");
    	for (i=0;i<a.length;i++) {
    		a[i]= ip.nextInt();
    	}
    	//System.out.println("Enter the no");
    	//no = ip.nextInt();
    }
    void show() {
    	/*System.out.println("array element-----");
    	for (i=0;i<a.length;i++) {
    		System.out.println(a[i]+"");    */
    	for(i=0;i<a.length;i++) {
    		if(a[i]== no) {
    			System.out.println("No found atleast = "+i);
    			break;
    		}
    	}
    	if(i>a.length-1) {
    		System.out.println("no not found");
    	}
    }
     public static void main(String[] args) {
	  Arr ob = new Arr();
	  ob.set();
	  ob.show();
	  }
}
