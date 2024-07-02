package Package1;

public class Class2 {

	public void dummy() {
		Class1.a = 10; //Cannot assign the value 10 to variable a since its access modifier is set to private which means the variable can only be used within its own class
		Class1.b = 10;
		Class1.c = 10;
		Class1.d = 10;
	}

}
