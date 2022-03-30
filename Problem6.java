package zoho;
import java.util.Scanner;
public class Problem6 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of the element");
		int size=input.nextInt();
		System.out.println("Enter the elements of the array");
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=input.nextInt();
		}
		int n1=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>n1) {
				n1=arr[i];
			}
		}
		int n2=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>n2 && arr[i]!=n1) {
				n2=arr[i];
			}
		}
		int n3=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>n3 && arr[i]!=n1 && arr[i]!=n2) {
				n3=arr[i];
			}
		}
		System.out.println(n1+n3);
	}

}
