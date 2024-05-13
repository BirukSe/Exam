package question1;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		int[] array=new int[5];
		Scanner scan=new Scanner(System.in);
		System.out.println("ENTER A NUMBER");
		for(int i=0; i<array.length; i++) {
			System.out.println("Another");
			
			int num=scan.nextInt();
			array[i]=num;
		}
		System.out.println("Enter a number to be searched");
		int ss=scan.nextInt();
		int count=0;
		for(int j=0; j<array.length; j++) {
			if(array[j]==ss) {
				count++;
				
			}
		}
		System.out.println(ss+" appears "+count+" times ");
		
		
		

	}

}
