package practice;

public class palindromeCheck {

	public static void main(String[] args) {
		// check if a string is a palindrome
		String[] words = {"Kayak", "CiviC", "Amin", "Madam", "hello"};
		//loop the array to display palindromes
		for(int i =0; i< words.length; i++ ) {			
			System.out.println(words[i]+ " " + checkPalindrome(words[i]));
		}

	}
	
	public static boolean checkPalindrome(String word) {
		//convert the word to lowercase bcz uppercase and lowercase != equal
		String lowerCase = word.toLowerCase();
		//create a string builder to hold the reverse
		StringBuilder str = new StringBuilder();
		str.append(lowerCase);
		//reverse the string
		str.reverse();
		
		return lowerCase.contentEquals(str) ? true : false;
		
	}

}
