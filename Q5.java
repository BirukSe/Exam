package question5;
import java.util.Scanner;
import java.util.Arrays;

public class Q5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] array=new int[5];
		System.out.println("Enter a number");
		for(int i=0; i<array.length; i++) {
			int num=scan.nextInt();
			array[i]=num;
			
			
		}
		System.out.println("BEFORE SORTING");
		System.out.println(Arrays.toString(array));
		System.out.println("AFTER SORTING");
		mergeSort(array);
		System.out.println(Arrays.toString(array));
		
		
		

	}
	 public static void mergeSort(int[] array) {
	    	int len=array.length;
	    	if(len<2) {
	    		return;
	    	}
	    	int mid=len/2;
	    	int[] left=new int[mid];
	    	int[] right=new int[len-mid];
	    	for(int i=0; i<mid; i++) {
	    		left[i]=array[i];
	    		
	    	}
	    	int k=0;
	    	for(int i=mid; i<len; i++) {
	    		right[k]=array[i];
	    		k++;
	    	}
	    	mergeSort(left);
	    	mergeSort(right);
	    	merge(array, left, right);
	    	
	    	 
	    	
	    }
	  public static void merge(int[] array, int[] left, int[] right) {
	    	int leftSize=left.length;
	    	int rightSize=right.length;
	    	int i=0, j=0, k=0;
	    	while(i<leftSize && j<rightSize) {
	    		if(left[i]<=right[j]) {
	    			array[k]=left[i];
	    			i++;
	    		}
	    		else {
	    			array[k]=right[j];
	    			j++;
	    			
	    			
	    		}
	    		k++;
	    	}
	    	while(i<leftSize) {
	    		array[k]=left[i];
	    		i++;
	    		k++;
	    	}
	    	while(j<rightSize) {
	    		array[k]=right[j];
	    		j++;
	    		k++;
	    		
	    	}
	    	
	    	
	    }

}

