package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		FoodTruck trucks = new FoodTruck();
		FoodTruck topFive[] = new FoodTruck[5];
		String truckName = "";
		int truckCounter = 0;
		int menuChoiceOption = 0;
		System.out.println("Food Truck War Rater!");
		System.out.println("Boot up coomplete\n\n");
		System.out.println("Please enter up to five food truck information.");
		
		while(!truckName.equals("quit"))	{
			System.out.println("Please enter trucks name or quit to stop inputting food trucks early: ");
			truckName = kb.nextLine();
			if(truckName.equals("quit")) {
				continue;
			}
			
			topFive[truckCounter] = trucks.createTruck(truckName);
			
			truckCounter++;
			if(truckCounter > 4) {
				break;
			}
		}
		while(menuChoiceOption != 4) {
		menuChoiceOption = trucks.menuChoice(kb, topFive);
		
		
		
		}
		System.out.println("Thank you for using Food Truck War Rater");
		System.out.println("Application is shutting down....");
		kb.close();
	}
	
	
	
}
