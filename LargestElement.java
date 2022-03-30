package Programming;
import java.util.Scanner;
public class LargestElement {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=input.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the elements of the array");
		int largest=0;
		for(int i=0;i<size;i++) {
			arr[i]=input.nextInt();
			if(largest<arr[i]) {
				largest=arr[i];
			}
		}
		int count=1;
		for(int i=0;i<size;i++) {
			if(arr[i]*2<=largest && arr[i]!=largest) {
				count++;
			}
		}
		if(size==1) {
			System.out.println(0);
		}else if(count-1==size-1)
		{
			System.out.println(1);
		}else {
			System.out.println(-1);
		}
	}

}
