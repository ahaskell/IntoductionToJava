public class BasicArray {

	public static void main(String[] args) {
		int[] values = new int[5]; // Initializer!
		values[0] = 12;
		values[4] = 12;
		values[5] = 12; // TODO: Is this okay?
		/*TODO: What Will this be?*/
		System.out.println("Length: " + values.length);
		
		/*TODO: Is there an issue here?*/
		// int[] newValues = {1, 2.5, 3, 3.5, 4}; 
		
		/*TODO: What is this?*/
		// System.out.println("Value of index 2: " + newValues[2]); 
	}

}
