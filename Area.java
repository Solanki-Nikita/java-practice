import java.util.Scanner;
public class Area {

	public static void main(String[] args) {
		int a,l,b;
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the value of l,b");
		l = ip.nextInt();
		b = ip.nextInt();
		a = l*b;
		System.out.println("Enter area of rectangle="+a);
	}

}
