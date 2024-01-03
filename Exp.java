import java.util.Scanner;
import java.util.InputMismatchException;
public class Exp {
int a,b;
Scanner ip = new Scanner(System.in);
void set() {
	try {
	System.out.println("Enter the value of a,b");
	a = ip.nextInt();
	b = ip.nextInt();
	}
	catch(Exception e) 
	{
		e.printStackTrace();
	}
}

void show() {
	System.out.println("value of a = "+a);
	System.out.println("value of b = "+b);
}
	public static void main(String[] args) {
		Exp ob = new Exp();
		ob.set();
		ob.show();
	}

}



