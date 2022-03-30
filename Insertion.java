package Programming;
import java.util.Scanner;
public class Insertion {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int size=input.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=input.nextInt();
		}
		int value=input.nextInt();
		int count=0;
		int temp;
		for(int i=0;i<size;i++) {
			if(arr[i]<value) {
				count++;
			}else {
				temp=arr[i];
				int j=i;
				for(j=i;j<size;j++) {
					if(arr[j]<value) {
						temp=arr[j];
						break;
					}
				}
				swap(arr,i,temp,j);
			}
		}
//		for(int i=0;i<size;i++) {
//			System.out.print(arr[i]+" ");
//		}
	}
	static void swap(int[] arr,int indexpos,int temp,int swappos) {
		int temp2=arr[indexpos];
		int temp3;
		for(int i=indexpos;i<swappos-1;i++) {
			temp3=arr[i+1];
			arr[i+1]=temp2;
			temp2=temp3;
			
		}
		arr[indexpos]=temp;
//		return arr;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
