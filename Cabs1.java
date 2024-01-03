
abstract class Abs1
{
	int a;
	void show()
	{
		a = set();
		System.out.println( );
	}
	abstract int set();
}
class Cabs1 extends Abs1
{
     int a;
     int set() 
     {
    	 a = 20;
    	 return a;
     }
     public static void main(String[] args) {
		//Abs1 ob = new Abs1();
    	 Cabs1 ob = new Cabs1();
    	 ob.set();
    	 ob.show();
	}

}
