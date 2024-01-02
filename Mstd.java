// Character or string ko kese input krate hai 


import java.util.Scanner;
class Student{
	String name;
	int age;
	int Roll_no;
	void set() {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the name");
		name = ip.nextLine();
		System.out.println("Enter the age");
		age = ip.nextInt();
		System.out.println("Enter the Roll_no");
		Roll_no = ip.nextInt();
		}
	    void show() {
	    	System.out.println("name \t age \t Roll_no");
	    	System.out.println(name+"\t"+age+"\t"+Roll_no);
	    }
	    
	   }

public class Mstd {

	public static void main(String[] args) {
		Student ob = new Student();
		ob.set();
		ob.show();
	}

}
