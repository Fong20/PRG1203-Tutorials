package Lab11_inheritance;

public class Dog extends Animal {
	
	//Declare constructor
	public Dog(String nm, int lg) {
		super(nm, lg);
	}
	
	@Override
	public void move(int m) {
		super.move(m);
		System.out.printf("Running %d meter \n\n", getMeter());
}

	@Override
	public String toString() {
		return String.format("Dog [%s],", super.toString());
	}
	
	
}
