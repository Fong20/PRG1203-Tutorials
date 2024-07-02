//Lab 4 question 1
//main program cartest
import java.util.ArrayList;
public class cartest {
	public static void main(String[] args) {
	
	//Creating 3 car objects from the car class
	Car car1 = new Car("Proton", "Genetic Silver", 1600, 100);
	Car car2 = new Car("Mazda", "Soul Red Crystal", 2000, 160);
	Car car3 = new Car("Honda", "Championship White", 2500, 200);
	
	//Testing the setter method (Calling the setter method to change the brand of the object car 1)
	car1.setBrand("Toyota");
	
	//Testing the getter method (Calling the getter method to print out the value of the object car 1)
	car1.getBrand();
	
	//Testing the accelerate method (accelerating the car object 1)
	car1.accelerate(100);
	
	//Testing the decelerate method (decelerating the car object 1)
	car1.decelerate(90);
	
	//Testing the stop method (stopping the car object 1)
	car1.stop(50);
	
	//Testing out toString() method
	System.out.println(car1);
	
	//Storing all the car objects to an ArrayList
	ArrayList<Car> ar = new ArrayList<Car>();
	ar.add(car1);
	ar.add(car2);
	ar.add(car3);
	
	//Printing out all the car objects using a for loop
	for (int i=0; i < ar.size(); i++) {
		System.out.println(ar.get(i));
	
	}
	
	
	}
	
}
