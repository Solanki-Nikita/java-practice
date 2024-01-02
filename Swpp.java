import java.util.Scanner;

// swapping without using third variable;
class SW{
	int a,b;
	void set() {
		Scanner ip =new Scanner(System.in);
		System.out.println("Enter the value of a,b");
		a = ip.nextInt();
		b = ip.nextInt();
		}
	void cal()
	{
		a=a*b;
		b=a/b;
		a=a/b;
	}
	void show()
	{
		System.out.println("value of a=" +a);
		System.out.println("value of b=" +b);
	}
}
public class Swpp {

	public static void main(String[] args) {
		SW ob = new SW();
		ob.set();
		ob.cal();
		ob.show();
		
	}

}
