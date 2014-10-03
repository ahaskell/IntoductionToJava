import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CheckExceptionCheat {
	
	 public static void main(String[] arguments){
		System.out.println(readInput());
		//System.out.println(combine("Hello", 10));
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
