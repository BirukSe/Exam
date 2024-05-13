package question4;
import java.util.Arrays;

public class Q4 {
	

	public static void main(String[] args) {
		char[] array= {'a','c','e','b'};
		System.out.println("BUBBLE SORT ALGORITHM");
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length-1; j++) {
				if(array[j]>array[j+1]) {
					char temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					
				}
				
			}
		}
		System.out.println(Arrays.toString(array));
		
	
	}

}
