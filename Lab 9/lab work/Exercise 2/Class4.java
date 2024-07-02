package Package2;

import Package1.Class1;

public class Class4 extends Class1 {
	
	public void dummy() {
		Class1.a = 10; //Cannot assign the value 10 to variable a since its access modifier is set to private which means the variable can only be accessed within its own class
		Class1.b = 10;
		Class1.c = 10; //Cannot assign the value 10 to variable c since its access modifier is set to default which means the variable can only be accessed within the same package
		Class1.d = 10; //Value of 10 is assigned to the variable d of Class1 since inheritance is used here to access the variable which is set to protected access modifier
	}
}
