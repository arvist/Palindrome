import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word = scanner.next(); 				
		
		boolean isPalindrome = true;
		for(int i=0;i<word.length();i++) {
			//rotator
			if(word.charAt(i) != word.charAt(word.length()-(i+1))) {
				//word.charAt(i) - i-tais no kreisas
				//word.charAt(word.length()-(i+1)) - i-tais no labas
				isPalindrome  = false;
			}
		}
		System.out.println("Ir palindroms : " + isPalindrome);
		/*String reverse = new StringBuilder(word).reverse().toString();
		System.out.println("Ir palindroms : " + word.equals(reverse));
		
		
		char[] wordArr = word.toCharArray();
		char[] reverseArr = new char[wordArr.length];
		
		int reverseArrIndex = 0;
		for(int i = (wordArr.length-1); i >= 0; i--) {
			reverseArr[reverseArrIndex] = wordArr[i];
			reverseArrIndex++;
		}
		
		boolean isPalindrome = true;
		for(int i=0; i<wordArr.length; i++) {
			if(wordArr[i]!=reverseArr[i]) {
				System.out.println("Nav palindroms");
				isPalindrome  = false;
				break;
			}
		}
		
		if(isPalindrome) {
			System.out.println("Ir palindroms");
		}*/
	}
	
}
