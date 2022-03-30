package Programming;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=input.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<size;i++) {
			arr[i]=input.nextInt();
		}
		System.out.println("Enter the target ");
		int target=input.nextInt();
		boolean result=false;
		for(int i=0;i<size-1;i++) {
			for(int j=i+1;j<size;j++) {
				if(target==arr[i]+arr[j]) {
					result=true;
					System.out.println("Indices are "+i+" "+j);
				}
			}
		}
		System.out.println(result);

	}

}
