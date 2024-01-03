
public class Aoe {
int a[] = {1,2,3,4,5};
void show() {
	try {
	System.out.println(a[5]);
}
	catch(Exception e) {
		e.printStackTrace();
	}
}
	public static void main(String[] args) {
		Aoe ob = new Aoe();
		ob.show();
	}

}
