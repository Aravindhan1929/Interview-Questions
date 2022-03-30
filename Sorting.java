package Programming;
import java.util.Scanner;
public class Sorting {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=input.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<size;i++) {
			arr[i]=input.nextInt();
		}
		if(size%2!=0) {
			even(arr,size);
		}else {
			odd(arr);
		}
		

	}
	static void odd(int[] arr) {
		for(int i=0;i<arr.length/2-1;i++) {
			if(arr[i]>arr[i+1]) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		for(int i=arr.length/2;i<arr.length-1;i++) {
			if(arr[i]<arr[i+1]) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	static void even(int[] arr,int size) {
		for(int i=0;i<size/2;i++) {
			for(int j=i+1;j<(size/2)-1;j++) {
				if(arr[i]>arr[j] ){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=(size/2)+1;i<size;i++) {
			for(int j=i+1;j<=size-1;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
