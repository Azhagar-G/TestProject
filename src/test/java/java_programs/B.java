package java_programs;

//Method Override

/* Method override - same method & arguments,diff class
RTE -- WebDriver with chrome driver,javaScript executer
how to call parent class method --- Super Keyword,create object of parent class
this keyword - call same class method??
*/
public class B extends AbstractClass extends A {

	{
		System.out.println("123");
	}

	int a = 5;

	@Override
	public void A1() {

		this.A2(55);
		super.A1();

		super.A2(10);
		// this.a=a;
		System.out.println("Bike " + a);
		this.A2("String");
		this.A2(12);
		// super.A1();
	}

	@Override
	public void A2(int b) {
		System.out.println(b);

	}

	// String b="ab";
	public static void A2(String b) {
		System.out.println(b);
	}

	public static void main(String[] args) {

		B b1 = new B();
		// b1.A1();
		// A b2=new A();
		// b2.A1();
		A2("String A2");
	}

	@Override
	public void A() {
		System.out.println("---------");
		
	}
}
