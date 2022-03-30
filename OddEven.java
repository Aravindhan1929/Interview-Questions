package Programming;
import java.util.Scanner;
public class OddEven {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		int size=input.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the size of the array ");
		int largest=0;
		for(int i=0;i<size;i++) {
			arr[i]=input.nextInt();
			if(arr[i]%2 ==0 && arr[i]>largest) {
				largest=arr[i];
			}
		}
		int secondlargest=0;
		for(int i=0;i<size;i++) {
			if(arr[i]%2==0 && arr[i]!=largest && secondlargest<arr[i]) {
				secondlargest=arr[i];
			}
		}
		System.out.println(secondlargest);
		int smallest=largest;
		for(int i=1;i<size;i++) {
			if(arr[i]%2!=0 && smallest>arr[i]) {
				smallest=arr[i];
			}
		}
		int k=size;
		int secondsmallest=largest;
		while(k-->0) {
			if(arr[k]%2 !=0 && arr[k]!=smallest) {
				secondsmallest=arr[k];
			}
		}
		for(int i=0;i<size;i++) {
			if(arr[i]%2 !=0 && arr[i] != smallest && arr[i]<secondsmallest) {
				secondsmallest=arr[i];
			}
		}
		if(secondsmallest==largest) {
			System.out.println("There is no second smallest odd number");
		}else{
			System.out.println(secondsmallest);
		}
		
	}
}
