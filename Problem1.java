package zoho;
import java.util.Scanner;
public class Problem1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int size=input.nextInt();
		int[] array=new int[size];
		System.out.println("Enter the size of the element :");
		for(int i=0;i<size;i++) {
			array[i]=input.nextInt();
		}
		System.out.println("Enter the element that need to find the occurence");
		int element=input.nextInt();
		int count=0;
		for(int i=0;i<size;i++) {
			if(array[i]==element) {
				count++;
			}
		}
		System.out.println("the total occurence of the element in the array is : "+count);
	}

}
