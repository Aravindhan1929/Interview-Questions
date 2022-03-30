package zoho;
import java.util.Scanner;
public class Problem5 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size=input.nextInt();
		System.out.println("Enter the elements of the array : ");
		int[] array=new int[size];
		for(int i=0;i<size;i++) {
			array[i]=input.nextInt();
		}
		int sum=array[0];
		int count=0;
		for(int i=1;i<size-1;i++) {
			int temp=0;
			int j=i;
			while(++j<size) {
				temp+=array[j];
			}
			if(sum==temp) {
				count=i+1;
				break;
			}else {
				sum+=array[i];
			}
		}
		if(size==1) {
			System.out.println("1");
		}
		else if(count==0) {
			System.out.println("-1");
		}else {
			System.out.println("The equlibrium position is : "+count);
		}

	}

}
