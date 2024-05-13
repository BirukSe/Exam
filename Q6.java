package question6;

import java.util.Arrays;

public class Q6 {

	public static void main(String[] args) {
		int[] array= {3,7,1,9,4};
		int value=1;
		System.out.println(Arrays.toString(deleteElement(array, value)));
	
		
		

	}
	public static int[] deleteElement(int[] array, int value) {
	    int index = -1; 
	    for (int i = 0; i < array.length; i++) {
	        if (array[i] == value) {
	            index = i;
	            break;
	        }
	    }

	    if (index == -1) {
	        System.out.println("Value not found in the array");
	        return array;
	    } else {
	        int[] newArray = new int[array.length - 1];
	        for (int i = 0, j = 0; i < array.length; i++) {
	            if (i != index) {
	                newArray[j++] = array[i];
	            }
	        }
	        return newArray;
	    }
	}



	
	

}
