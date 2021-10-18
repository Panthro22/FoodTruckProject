package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruck {
	private String truckName;
	private String foodType;
	private int foodTruckId;//foodTruckId++ will work as well.
	private double foodTruckRating;
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public FoodTruck() {
	}

	private FoodTruck(String name, String food, double rating, int id) {
		this.truckName = name;
		this.foodType =food;
		this.foodTruckRating = rating;
		this.foodTruckId = id;
		
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public FoodTruck createTruck(String givenName) {
		String foodTruckName = "";
		String foodOfTruck = "";
		double foodTruckRating = 0;
		Scanner kb = new Scanner(System.in);
		
			
		foodTruckName = givenName;
		
		foodOfTruck = getTruckFood(kb);
				
		foodTruckRating = getTruckRating(kb);
		
		int foodTruckId = assignTruckId(foodTruckName);		
				
				
				FoodTruck trucking = new FoodTruck(foodTruckName, foodOfTruck,  foodTruckRating, foodTruckId);
		
		return trucking;
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public String getTruckName(Scanner kb) {
		String foodTruckName = "";
		System.out.println("Please enter the name of the Food Truck: ");
		foodTruckName = kb.nextLine();
		return foodTruckName;
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public String getTruckFood(Scanner kb) {
		String foodOfTruck = "";
		System.out.println("Please enter the type of food served at the food Truck: ");
		foodOfTruck = kb.nextLine();
		return foodOfTruck;

	}
	
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public double getTruckRating(Scanner kb) {
		double foodTruckRating = 0;
		System.out.println("Please enter a 1 - 5 star rating: ");
		foodTruckRating = kb.nextDouble();
		kb.nextLine();
		return foodTruckRating;
		
	}

	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public void menuOption() {
		System.out.println("----------------------------------------------");
		System.out.println("| Following Menu options:                    |");
		System.out.println("| 1: List all existing food truck.           |");
		System.out.println("| 2: See the average rating of Food trucks.  |");
		System.out.println("| 3: Display the highest-rated food truck.   |");
		System.out.println("| 4: Quit the program.                       |");
		System.out.println("----------------------------------------------");
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public int menuChoice(Scanner kb,FoodTruck[] truckList) {
		int menuOptionChoice = 0;
		while(menuOptionChoice != 4) {
			menuOption();
			menuOptionChoice = kb.nextInt();
			kb.nextLine();
			switch(menuOptionChoice) {
			case 1:
				System.out.println("Gathering List.... Displaying:");
				for(int iteration =0 ; iteration < truckList.length; iteration++ ) {
					if(truckList[iteration]== null) {
						continue;
					}
					else {
						System.out.println(truckList[iteration].toString());
					}
				}
				break;
			case 2:
				System.out.println("Calculating the average of Food Trucks ratings: ");
				System.out.printf("Food Trucks Averages are : %.1f \n", getAverageRating(truckList));
				break;
			case 3:
				System.out.println("Finding the highest rated Food Truck...");
				System.out.println("The highest rated Food Truck is: ");
				System.out.println(topFoodTruck(truckList));
				break;
			case 4:
				//No why you leave now! we haven't had second breakfast???
				break;
			}
		}
		return menuOptionChoice;
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public String toString() {
		String output = "Truck name = " + truckName + ",Food type = " + foodType + ", Food truck id = " + foodTruckId
				+ ", Food truck rating = " + foodTruckRating;
		return output;
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


	public String getTruckName() {
		return truckName;
	}

	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getFoodTruckId() {
		return foodTruckId;
	}

	public void setFoodTruckId(int foodTruckId) {
		this.foodTruckId = foodTruckId;
	}

	public double getFoodTruckRating() {
		return foodTruckRating;
	}

	public void setFoodTruckRating(double foodTruckRating) {
		this.foodTruckRating = foodTruckRating;
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public double getAverageRating(FoodTruck[] truckList) {
		double averageRating = 0;
		int truckCounter = 0;
		for(int iteration = 0; iteration < truckList.length; iteration++) {
			if(truckList[iteration] == null) {
				continue;
			}
			else {
				averageRating += truckList[iteration].getFoodTruckRating();
				truckCounter++;
			}
		}
		averageRating = averageRating / truckCounter;
		return averageRating;
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public FoodTruck topFoodTruck(FoodTruck truckList[]) {
		int topFoodTruck = 0;
		
		for(int iteration = 0; iteration < truckList.length; iteration++ ) {
			if(truckList[iteration]==null) {
				continue;
			}
			if(truckList[topFoodTruck].getFoodTruckRating() < truckList[iteration].getFoodTruckRating()) {
				topFoodTruck = iteration;
				
			}
			else {
				
			}
		}
		
		return truckList[topFoodTruck];
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void printTopBorder() {
		
	}
	
	public void printSidesBorder() {
		
	}
	
	public void printBottemBorder() {
		
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public int assignTruckId(String truckName) {
		int id = 0;
		String stringId = "";
		char singleChar[] = truckName.toCharArray();
		id = foodTruckId++;
//		
//		for(int iteration = 0; iteration < truckName.length(); iteration++) {
//				if ((singleChar[iteration] >= 'A' && singleChar[iteration] <= 'Z') || (singleChar[iteration] >= 'a' && singleChar[iteration] <= 'z')) {
//			switch(singleChar[iteration]) {
//				case 'a':
//				case 'A':
//					stringId +="65";
//					break;
//				case 'b':
//				case 'B':
//					stringId +="66";
//					break;
//				case 'c':
//				case 'C':
//					stringId +="67";
//					break;
//				case 'd':
//				case 'D':
//					stringId +="68";
//					break;
//				case 'e':
//				case 'E':
//					stringId +="69";
//					break;
//				case 'f':
//				case 'F':
//					stringId +="70";
//					break;
//				case 'g':
//				case 'G':
//					stringId +="71";
//					break;
//				case 'h':
//				case 'H':
//					stringId +="72";
//					break;
//				case 'i':
//				case 'I':
//					stringId +="73";
//					break;
//				case 'j':
//				case 'J':
//					stringId +="74";
//					break;
//				case 'k':
//				case 'K':
//					stringId +="75";
//					break;
//				case 'l':
//				case 'L':
//					stringId +="76";
//					break;
//				case 'm':
//				case 'M':
//					stringId +="77";
//					break;
//				case 'n':
//				case 'N':
//					stringId +="78";
//					break;
//				case 'o':
//				case 'O':
//					stringId +="79";
//					break;
//				case 'p':
//				case 'P':
//					stringId +="80";
//					break;
//				case 'q':
//				case 'Q':
//					stringId +="81";
//					break;
//				case 'r':
//				case 'R':
//					stringId +="82";
//					break;
//				case 's':
//				case 'S':
//					stringId +="83";
//					break;
//				case 't':
//				case 'T':
//					stringId +="84";
//					break;
//				case 'u':
//				case 'U':
//					stringId +="85";
//					break;
//				case 'v':
//				case 'V':
//					stringId +="86";
//					break;
//				case 'w':
//				case 'W':
//					stringId +="87";
//					break;
//				case 'x':
//				case 'X':
//					stringId +="88";
//					break;
//				case 'y':
//				case 'Y':
//					stringId +="89";
//					break;
//				case 'z':
//				case 'Z':
//					stringId +="90";
//					break;
//				default:
//					System.out.println("What a name");//Just in case anything else besides a letter is being evaluated at this point.
//					break;
//			}
//			}
//				else {
//					// skip anything that isn't a U.S. letter
//				}
//		}
//		
//		char idChar[] = stringId.toCharArray();
//		for(int iteration = 0; iteration < truckName.length(); iteration++) {
//		id +=(int)idChar[iteration]+123456;
//		}

		return id;
	}
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
