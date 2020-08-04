package lab12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarAppPart2 {

	public static Scanner scnr = new Scanner (System.in);
	public static List<Car> cars= new ArrayList<>();
	
	static {
		
		cars.add(new Car("BMW", "750 Li", 2014, 30000.00));
		cars.add(new Car("BMW", "550 i", 2015, 27000.00));
		cars.add(new Car("Audi", "A8", 2012, 20000.00));
		cars.add(new Car("Audi", "A6", 2019, 19000.00));
		cars.add(new UsedCar("Mercedes", "Benz S63", 2015, 90000.00,70000.00 ));
		cars.add(new UsedCar("Mercedes", "AMG S65", 2016, 100000.00,80000.00));
		
	}
	
	public static void main(String[] args) {
		
		listCars();

		
	}
	public static void listCars() {
		for(int i=0; i<cars.size();i++) {
			System.out.println("Car "+ (i+1)+ " : "+cars.get(i));			
		}
	}
	
	public static void showCarsById(int id) {
			System.out.println(cars.get(id-1));			
		
	}
	
	public static void buyCar(int id) {
		cars.remove(id-1);
}

}
