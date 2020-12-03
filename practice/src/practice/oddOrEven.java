package practice;

public class oddOrEven {

	public static void main(String[] args) {
		int number = 21;
		
		System.out.println(
				checkNum(number) ? "The number " + number +" is EVEN" : "The number " + number + " is ODD"
				);
		
		getEvenOddNumbers(number);
		
	}
	
	// A function to identify whether a number is even of odd
	public static boolean checkNum(int num) {
		if((num %2) == 0) {
			return true;
		}
		
		return false;
	}
	
	// A function to get all the odd an even numbers between 1 and a given input
	// This function calls the checkNum function to evaluate whther a number is even or odd before printing it
	public static void getEvenOddNumbers(int n) {
		for(int i = 1; i<= n; i++) {
			if(checkNum(i)) {
				System.out.println("\n" + i + " - EVEN");
			} else {
				System.out.println("\n" + i + " - ODD");
			}
		}
		
	}
	
	

}
