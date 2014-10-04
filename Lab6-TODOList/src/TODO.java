import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TODO{
	//Challenge how do we simplify this. 
	public static void main(String[] args) {
		
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
