# Part 1 
In this assignment, you will create a program that computes the distance an object will fall in
Earth's gravity. 

1. Create a new class called GravityCalculator. 
1. Copy and paste the following initial version: 
	```	
	class GravityCalculator {
		public static void main(String[] arguments) {
			double gravity; // a
			double fallingTime = 0.0; // t
			double initialPosition = 0.0; //v sub i
			double initialVelocity = 0.0; // x sub i
			double finalPosition = 0; //TODO: Calculate this!
			System.out.println("The object's position after " + fallingTime
					+ " seconds is " + finalPosition + " m.");
		}
	}
	```
1. Earth's Gravity is -9.80665 m/s^2, set gravity to the appropriate value
1. Run it in Eclipse (Run ? Run As ? Java Application). and see it work

#Part 2 
Modify the example program to compute the position of an object after falling for 10 seconds, from an initial position of 500 meters.

Note: The correct value is 9.6675 m. Java will output more digits after the decimal place, but that is unimportant. 