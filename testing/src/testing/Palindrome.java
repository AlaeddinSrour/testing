package testing;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "Otto";
		String inputReversed = "";
		
		for (int i = input.length()-1; i >= 0; --i) {
			
			inputReversed= inputReversed + input.charAt(i);
			
			

			}
		if (input.equalsIgnoreCase(inputReversed)) {
			System.out.println(input +" is palindrome");
		} else {
			System.out.println(inputReversed +" is not palindrome");

		}

	}

}
