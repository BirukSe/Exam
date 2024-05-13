package question2;
import java.util.Arrays;
public class Q2 {
	int value;
	int s=0;
	int size;
	int[] array;
	int top=-1;
	public Q2(int size) {
		this.size=size;
		array=new int[this.size];
	}
	public void push(int value) {
		array[++top]=value;
		size++;
		
	}
	public int pop() {
		size--;
		if(size<1) {
			return -1;
		}
		else {
			
			return array[top--];
		}
	}
	

	public static void main(String[] args) {
		Q2 stack=new Q2(5);
		stack.push(4);
		stack.push(3);
		stack.push(8);
		stack.push(3);
		stack.push(1);
	
		System.out.println(Arrays.toString(stack.array));
		System.out.println(	stack.pop());
		
		
		

	}

}
