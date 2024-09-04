package Lab11_inheritance;

public class Animal {
	//Declare attributes
	private String name;
	private int leg, meter = 0;
	
	//Create constructor
		public Animal(String nm, int lg) {
			name = nm;
			leg = lg;
		}
	
	public void setName(String nm) {
		name = nm;
	}
	
	public String getName() {
		return name;
	}
	
	public void setLeg(int lg) {
		leg = lg;
	}

	public int getLeg() {
		return leg;
	}
	
	public void setMeter(int s) {
		meter = s;
	}

	public int getMeter() {
		return meter;
	}
	
	public void eat() {
		System.out.println("Eating");
	}
	
	public void move(int m) {
		meter += m;
	}

	@Override
	public String toString() {
		return String.format("name=%s, leg=%s, meter=%s", name, leg, meter);
	}
	
	

	
	
	

	

	
	
	

}
