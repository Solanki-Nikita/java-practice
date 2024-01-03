
public class Nfe {
     String s = "123t";
     int no;
     void cal() {
    	 try {
    		 no = Integer.parseInt(s);
    		 System.out.println(s);
    	 }
    	 catch(Exception e) {
    		 e.printStackTrace();
    	 }
     }
	public static void main(String[] args) {
              Nfe ob = new Nfe();
              ob.cal();
	}

}
