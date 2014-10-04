import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZorkBeginnings {

	public static void main(String[] arguments) {
		
	}

	public static String readInput(String prompt) throws IOException{
		System.out.print(prompt + " ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}
}
