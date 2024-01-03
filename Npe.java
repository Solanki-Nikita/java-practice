
public class Npe {
 String s = null;
 void cal() {
	 try {
		 System.out.println(s.length());
	 }
	 catch(Exception e) {
		 e.printStackTrace();
	 }
	 finally{
		 System.out.println("this block will run");
	 }
 }
	public static void main(String[] args) {
              Npe ob = new Npe();
              ob.cal();
        }

}
