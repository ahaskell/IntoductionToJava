public class BreakExample {

	public static void main(String[] args) {
		int i = 1;
		while (true) {
			if(i <= 3){
				break;
			}
			System.out.println("Rule #" + i);
			i = i + 1;
		}
	}
	// Challenge: Change 1 character to make this never stop.
}
