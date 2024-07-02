package Package2;

import Package1.Class1;

public class Class3 {
	public void dummy() {
		Class1.a = 10; //Cannot assign the value 10 to variable a since its access modifier is set to private which means the variable can only be accessed within its own class
		Class1.b = 10;
		Class1.c = 10; //Cannot assign the value 10 to variable c since its access modifier is set to default which means the variable can only be accessed within the same package
		Class1.d = 10; //Cannot assign the value 10 to variable d since its access modifier is set to protected which means the variable can only be accessed outside its package through inheritance
	}
}
