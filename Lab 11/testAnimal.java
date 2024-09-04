package Lab11_inheritance;

import java.util.ArrayList;

public class testAnimal {
	public static void main(String[] args) {
		
		//Create an array list
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		
		//Create objects
		Dog d1 = new Dog("Bobo", 4);
		Dog d2 = new Dog("Esther", 4);
		Bird b = new Bird("Birdie", 2);
		Fish f1 = new Fish("Fifi", 0, "Fresh");
		Fish f2 = new Fish("Dorry", 0, "Salt");
		
		//Add all the objects into the arraylist
		animalList.add(d1);
		animalList.add(d2);
		animalList.add(b);
		animalList.add(f1);
		animalList.add(f2);
		
		
		for(Animal a: animalList) { //Loop through all the objects in the arrayList and place it into a variable name a
			
			a.eat(); //ask all the animals to eat
			
			//If it is a fish, move the fish by 50 metres
			//Because animal class does not have getWaterType, so we need to cast it to fish to access the getWaterType method
			if (a instanceof Fish) {
				if (((Fish) a).getWaterType().equals("Salt")) { 
					a.move(50);
				}
				else {
					a.move(10);
				}	
			}
			
			//If it is a dog, move the dog by 20 metres
			else if (a instanceof Dog) {
				a.move(20);
			}
			
			else {
				a.move(10); //Assign all animals to move 10 metres
			}
			
		}
	}

}
