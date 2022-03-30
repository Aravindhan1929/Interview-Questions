package zoho;
import java.util.Scanner;
public class Problem4 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=input.nextInt();
		System.out.println("Enter the elements of the array : ");
		int[] array=new int[size];
		for(int i=0;i<size;i++) {
			array[i]=input.nextInt();
		}
		System.out.print(array[0]+" ");
		for(int i=1;i<size;i++) {
			if(array[i-1]<=array[i]) {
				System.out.print(array[i]+" ");
			}
		}

	}

}
