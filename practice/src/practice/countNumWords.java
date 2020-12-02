package practice;

public class countNumWords {

	/* QUESTION: 
	 * Write a Java Program to count the number of words in a string
	 * 
	 * */
	
	public static void main(String[] args) {
		String str = "This is a long sentence. Counting the number of words in a string using a java program";
		
		//method 1
		int n = str.split(" ").length;
		
		//method 2
		//String [] splitStr= str.split(" ");
		//int count = splitStr.length;
		
		System.out.println(n);

	}

}
