
public class Soe {
String s = "Rahul";
void cal() {
	try {
		System.out.println(s.charAt(6));
	}
	catch(StringIndexOutOfBoundsException e) {
		e.printStackTrace();
	}
}
	public static void main(String[] args) {
		Soe ob = new Soe();
		ob.cal();
	}

}
