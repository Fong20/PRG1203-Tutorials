//Lab 4 question 1
//Dummy car class
public class Car {
	
	//Declare attributes
	public String brand, colour;
	public int engine_size, speed;
	
	//Declare constructor (method of the class)
	public Car(String b, String c, int e, int s) {
		brand = b;
		colour = c;
		engine_size = e;
		speed = s;
		
	}
	
	//Setter and  Getters
	public void setBrand(String b) {
		brand = b;
		
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setColour (String c) {
		colour = c;
	}
	
	public String getColour() {
		return colour;
	}
	
	public void setEngine_size(int e) {
		engine_size = e;
	}
	
	public int getEngine_size() {
		return engine_size;
	}
	
	public void setSpeed(int s) {
		speed = s;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	//Additional methods
	//Accelerate method
	public int accelerate(int s) {
		speed = s;
		speed +=1;
		return speed;
		
	}
	
	//Decelerate method
	public int decelerate(int s) {
		speed = s;
		speed -=1;
		return speed;
		
	}
	
	//Stop method
	public int stop(int s) {
		speed = s;
		speed = 0;
		return speed;
		
	}
	
	//toString method
	public String toString() {
		return String.format("The car with brand %s, color %s, engine size %d is running at speed %d", brand, colour, engine_size, speed);
	}
	
	
}

