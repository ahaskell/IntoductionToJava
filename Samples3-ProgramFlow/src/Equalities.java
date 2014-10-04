@SuppressWarnings("all")
public class Equalities {

	public static void main(String[] args) {
		String myString = "Hello All";
		
		//TODO: Will this print True or False?
		print(myString == "Hello All");
		//TODO: This one?
		print(myString == new String("Hello All"));
		//TODO: And this one
		print(myString == myString);
		//TODO: Equals to the rescue!
		print(myString.equals("hello all"));
		//TODO: Well Sort of 
		myString = null;
		print(myString.equals("Hello All"));
		

	}
	public static void print(Object item){
		System.out.println(item);
	}
}
