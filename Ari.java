import java.util.InputMismatchException;
import java.util.Scanner;

public class Ari {
	int a,b,c;
	void set(){
		Scanner ip = new Scanner(System.in);
	
	try {
		System.out.println("Enter the value of a,b");
		a = ip.nextInt();
		b = ip.nextInt();
	}
	catch(InputMismatchException e) {
		e.printStackTrace();
	}
}
	void div() {
		try {
			c= a/b;
	     }
		catch( Exception e) {
			e.printStackTrace();
		}
		
	}
	void show() {
		System.out.println("div="+c);
	}
public static void main(String[] args) {
       Ari ob = new Ari();
       ob.set();
       ob.div();
       ob.show();
	}

}
