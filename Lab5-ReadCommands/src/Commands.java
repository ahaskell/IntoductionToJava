import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Commands {

	public static void main(String[] arguments) {
		String whereToMove = readInput("What would you like to do?")
				.toLowerCase();
		if (!whereToMove.startsWith("move")) {
			System.out.println("I'm sorry you can not " + whereToMove
					+ " right now.");
			System.exit(-1);
		}
		String direction = whereToMove.replace("move ", "");
		if ("north".equals(direction)) {
			System.out.println("You moved North");
		} else if ("south".equals(direction)) {
			System.out.println("You moved South");
		} else if ("east".equals(direction)) {
			System.out.println("You moved East");
		} else if ("west".equals(direction)) {
			System.out.println("You moved West");
		} else {
			System.out.println("I'm sorry you can not move " + direction + ".");
		}
	}

	public static String readInput(String prompt) {
		System.out.print(prompt + " ");

		// open up standard input
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
