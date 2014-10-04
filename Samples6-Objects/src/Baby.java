public class Baby {
	/*Fields */
	String name;
	boolean isMale;
	double weight;
	double decibels;
	double diaperWeight = 0;
	private double amountOfFood = 0.0d;
	/*TODO: How would we access a baby's siblings? */
	
	void feed(Integer weight){
		amountOfFood = weight * 0.8d;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			amountOfFood = 0;
			System.out.println("Baby rejected the food.");
		}
		poop();
	}
	void poop() {
		double wasteLeft = amountOfFood * 0.25d;
		diaperWeight+=wasteLeft;
		amountOfFood = 0;
		System.out.println("Baby pooped! The diaper now has " + diaperWeight + " amount of waste.");
	}
}