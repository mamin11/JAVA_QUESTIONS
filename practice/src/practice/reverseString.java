package practice;

public class reverseString {
	
	/* QUESTION: 
	 * Write a Java Program to reverse a string without using String inbuilt function reverse() 
	 * 
	 * */
	public static void main(String[] args) {
		String str = "Amin";
		
		String reversedStr = reverse(str);
		
		System.out.println(reversedStr);
	}
	
	public static String reverse(String str) {
		int length = str.length();
		String newStr = "";
		
		for(int i = length -1; i>= 0; i--) {
			newStr += str.charAt(i);
		}
		
		return newStr;
	}

}
