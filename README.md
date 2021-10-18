# Food Truck Project

## Main Objective of Food Truck Project

### Food Truck App
This app is the means to using the object FoodTruck and its method to access the private information.

The app will hold an array up to 5 food trucks.
Using the Menu method in the FoodTruck class allows to see all food trucks listed with there respected information.


### Food Truck Object
Food Truck has 4 Private variables that are:
Food truck name, Type of food specialty, Food truck uniqueId, and Its rating.
all these are user inputed other than its unique Id. That one is a signed by the Food Truck class and not the user.
We have a private constructor only allowing the method inside to truly help the user correctly make a food truck and return it into an array in the app.
- The user can either put in five or quit early to see the following options.
* List all food trucks and their information that was inputted, with the Unique Id assigned to them.
* See the average rating of the five food trucks in the array.
* Display the highest rating food truck in the array.
* Quit the program when they are done using it.
#### Food Truck Methods
* createTruck() is the method that the app uses to collect the needed information from the user.
  * the calls the needed methods to collect each piece of information to enable the code to be more reusable if another constructor was made usable.
  * Once all information is collect it is then calling the private constructor to create their food truck input.
* getTruckName() simply gets the user to input the name of the Food truck.
* getTruckFood() simply gets the user input for the type of food.
* getFoodTruckRating() gets user input for the double value between 1-5 stars.
* menuOption() simply prints out the menu for user to see.
* menuChoice() takes the array list of food trucks from the app and gets the choice the user wants to do from the menu.
  * Using the array list of food trucks passed into the methods that need it.
* toString() allows all the information to be properly show when needed.
* commented out the get and setters that eclipse generates.
* Didn't complete the border builder methods.
* assignTruckId() Goes ahead and does a basic increase per Food truck entered to give it a unique id. Wasn't able to finish my other way to effective guarantee a unique ID.

### What I have learned.
* Arrays can lead to a stress of going into a rabbits hole and leave you wondering if you went down the wrong tunnel. Remember something to leave a trail to get you back on track.
* also learned that sometimes just keeping it simple is a better idea. reduces confusion and errors.
* making code reusable is a good sign.
