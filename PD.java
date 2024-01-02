//program to delete element from specific position
import java.util.Scanner;
public class PD {
	int a[]= new int[5];
	int i, pos , temp, size;
	Scanner ip;
	PD(){
		 ip.Scanner(System.in);
		size = a.length;
	}
	void set() {
		System.out.println("Enetr the array element");
		for(i=0;i<size;i++) {
			a[i]= ip.nextInt();
		}
		System.out.println("enter the position you want to delete");
		pos = ip.nextInt();
		}
	void del() {
		temp = a [pos-1];
		for (i=pos-1;i<size-1;i++) {
			a[i]= a[i+1];
		}
	}
	void show() {
		size--;
		System.out.println("Element delete ="+temp);
		for(i=0;i<size;i++) {
			System.out.println(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		PD ob = new PD();
		ob.set();
		ob.del();
		ob.show();
	}
}
