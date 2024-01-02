import java.util.Scanner;
public class Salary 
{
    double bs,ta,da,gs;
    void set() {
    	Scanner ip = new Scanner (System.in);
    	System.out.println("Enter the bs");
    	bs = ip.nextInt();
    }
    void cal()
    {
    ta = (bs*10)/100;
    da = (bs*20)/100;
    gs = bs+ta+da;
    }
    void show() {
    	System.out.println("gross Salary="+gs);
    }
	public static void main(String[] args) {
		Salary ob = new Salary();
		ob.set();
		ob.cal();
		ob.show();
		
	}

}
