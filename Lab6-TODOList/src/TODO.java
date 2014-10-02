import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TODO{
	//Challenge how do we simplify this. 
	public static void main(String[] args) {
		String[] tasks = new String[0];
		String userInput;
		do {
			userInput = prompt("Enter a Task: ");
			if("exit".equals(userInput.toLowerCase())){
				break;
			}
			String[] newTasks = new String[tasks.length +1];
			for(int i = 0; i < tasks.length; i++){
				newTasks[i] = tasks[i];
			}
			newTasks[tasks.length] = userInput;
			tasks = newTasks;
		}while(true);
		
		for(String task: tasks){
			System.out.println(task);
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
