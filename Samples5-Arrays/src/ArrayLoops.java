import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayLoops {

	public static void main(String[] args) {

		ArrayList<String> notes = new ArrayList<String>(); 
		for(int i = 0; i < notes.size();i++){
			notes.add(prompt("Give me a note:"));
		}
		for(String n : notes){
			System.out.println(n);
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
