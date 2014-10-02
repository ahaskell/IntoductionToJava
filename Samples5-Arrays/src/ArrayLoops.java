import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayLoops {

	public static void main(String[] args) {
		String[] notes = new String[3]; 
		for(int i = 0; i < notes.length;i++){
			notes[i] = prompt("Give me a note:");
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
