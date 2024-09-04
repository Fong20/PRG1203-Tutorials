package Lab11_inheritance;

public class Bird extends Animal {
	
	//Declare constructor
	public Bird(String nm, int lg) {
		super(nm, lg);
		
	}

	@Override
	public void move(int m) {
		super.move(m);
		System.out.printf("Flying %d meter \n\n", getMeter());
	
	}
	
	@Override
	public String toString() {
		return String.format("Bird [%s],", super.toString());
	}

}
