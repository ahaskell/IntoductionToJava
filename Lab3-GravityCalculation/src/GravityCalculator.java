class GravityCalculator {
	public static void main(String[] arguments) {
		double gravity = -9.80665; // a
		double fallingTime = 10.0; // t
		double initialPosition = 500.0; // v sub i
		double initialVelocity = 0.0; // x sub i
		double finalPosition = .5 * gravity * fallingTime * fallingTime;

		finalPosition = finalPosition +

		initialVelocity * fallingTime;
		finalPosition = finalPosition + initialPosition;

		System.out.println("The object's position after " + fallingTime
				+ " seconds is " + finalPosition + " m.");

	}
}

