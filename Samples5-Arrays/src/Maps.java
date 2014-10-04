import java.util.HashMap;

public class Maps {
	public static void main(String[] args) {
		HashMap<String,String> myInfo = new HashMap<String,String>();
		myInfo.put("name", "Adam");
		myInfo.put("twitter", "AHaskell");
		myInfo.put("email", "a.haskell@gmail.com");
		//TODO: What will the output look like?
		for(String key: myInfo.keySet()){
			System.out.println(key + " : " + myInfo.get(key));
		}
	}
}
