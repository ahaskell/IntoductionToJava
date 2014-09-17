import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Echo {

	 public static void main(String[] arguments){
		System.out.println("You typed: " + readInput("What shall I echo"));
		//System.out.println(combine("Hello", 10));
	}
	 
	 public static String readInput(String prompt){
		  System.out.print(prompt + ": ");
		 
	      //  open up standard input
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 
	      String userName = null;
	 
	      try {
	         userName = br.readLine();
	      } catch (IOException ioe) {
	         System.out.println("IO error trying to read your information!");
	         System.exit(1);
	      }
	      return userName;
	 }
}
