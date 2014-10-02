public class Baby {
	/*Fields */
	String name;
	boolean isMale;
	double weight;
	double decibels;
	int numPoops = 0;
	/*TODO: How would we access a baby's siblings? */
	
	void poop() {
		numPoops += 1;
		System.out.println("I have pooped. Ready the diaper.");
	}
}