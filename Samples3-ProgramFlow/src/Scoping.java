public class Scoping {
	public static void main(String[] args) {
		int outer = 1;
		
		{
			int inner = 2;
			System.out.println("inner = " + inner);
			System.out.println("outer = " + outer);
		}
		//TODO: What would happen if we moved this to line 4?
		int inner = 3;
		System.out.println("inner = " + inner);
		System.out.println("outer = " + outer);
	}
}