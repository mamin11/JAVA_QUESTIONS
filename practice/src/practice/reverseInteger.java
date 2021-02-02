package practice;

public class reverseInteger {

	public static void main(String[] args) {
		System.out.println(reverseInt(-123));
	}
	
	public static int reverseInt(int x ) {
		
		String str = "";
		String rev = "";
		int revNum = 0;
		
		str = String.valueOf(x);
		
		//reverse the number regardless of its sign
		for(int i = str.length(); i > 0; i--) {
			rev += str.charAt(i-1);
		}
			
		//if x is a positive number
		if(x>0) {
			try {
				return revNum = Integer.parseInt(rev);
			} catch(Exception e) {
				return 0;
			}
		} 
		//if x is a negative number
		else {
			//create a new string to exclude the -ve sign at the end of the reversed number
			String newRev = "";
			//loop up to the second last. before the -ve sign
			for(int i = 0; i < rev.length()-1; i++) {
				newRev += rev.charAt(i);
			}
			
			try {
			revNum = Integer.parseInt(newRev);
			} catch(Exception e) {
				return 0;
			}
			//multiply by -1 to convert it back to negative
			return (revNum * -1);
		}
				
	}

}
