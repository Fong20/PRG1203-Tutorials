package Lab11_inheritance;

public class Fish extends Animal {
	
	//Declare attributes
	String waterType;
	
	//Declare constructor
	public Fish(String nm, int lg, String t) {
		super(nm, lg);
		waterType = t;
	}
	
	public String getWaterType() {
		return waterType;
	}
	
	public void setWaterType(String t) {
		waterType = t;
	}

	@Override
	public void move(int m) {
		super.move(m);
		System.out.printf("Swimming %d meter \n\n", getMeter());
	}

	@Override
	public String toString() {
		return String.format("Fish [%s, WaterType=%s]", super.toString(), waterType);
	}
	
	

}
