import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunningTotal{
	//TODO: How do we Simplify this??
	public static void main(String[] args) {
		float runningTotal = 0.0f;
		
		String userInput = prompt("Number to add to total (type exit to exit): ");
		try{
			float numberToAdd = Float.parseFloat(userInput);
			runningTotal+= numberToAdd;
			System.out.println("Your running total is : " + runningTotal);
		}catch(NumberFormatException ex){
			if(!"exit".equals(userInput.toLowerCase())){
				System.out.println("Invalid input");
			}
		}
		
		
		while (!"exit".equals(userInput.toLowerCase())) {
			userInput = prompt("Number to add to total (type exit to exit): ");
			try{
				float numberToAdd = Float.parseFloat(userInput);
				runningTotal+= numberToAdd;
				System.out.println("Your running total is : " + runningTotal);
			}catch(NumberFormatException ex){
				if(!"exit".equals(userInput.toLowerCase())){
					System.out.println("Invalid input");
				}
			}
		}
	}
	public static String prompt(String userPrompt){
		System.out.print(userPrompt);
		return readInput();
	}
	 public static String readInput(){
	      //  open up standard input
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 
	      try {
	         return br.readLine();
	      } catch (IOException ioe) {
	         System.out.println("IO error trying to read your information!");
	         System.exit(1);
	      }
	      return null;
	 }
}
