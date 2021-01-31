package practice;

import java.util.Arrays;
import java.util.Scanner;

public class closestToZero {

	//a program that finds the number closest to 0 from a range of input
    public static void main(String args[]) {
    	System.out.println("How many numbers in total: ");
        Scanner in = new Scanner(System.in);
        
        // the number of temperatures to analyse
        int n = in.nextInt(); 
        //array to hold user inputs
        int [] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
        	System.out.println("Enter value "+(i+1));
        	// a temperature expressed as an integer ranging from -273 to 5526
            int t = in.nextInt();
            //add each entry to the array
             arr[i] = t;
        }
        
        //sort the array
        Arrays.sort(arr);
        
        //set current to 0
        int current = 0;
        
        //assume nearest is first index
        int near = arr[0];
        
        //loop the sorted array
             for(int j = 0; j<arr.length; j++) {
            	 //square each number to make them all postive
                 current = arr[j] * arr[j];
                 
                 //if the current index value is less <= to the number in previous index, it becomes nearest.
                 //the first number in the array is compared to itself, since near was intialized to index 0
                 if(current <= (near*near)) {
                     near = arr[j];
                 }
             }
         //print the nearest
        System.out.println(near + " is closest to zero");
    }
}
