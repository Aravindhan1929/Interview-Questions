package zoho;
import java.util.Scanner;
public class Problem7 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int size=input.nextInt();
		int count=1;
		System.out.println("Enter the l value ");
		int l=input.nextInt();
		int[][] arr=new int[size][size];
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(count==10) {
					count=0;
					arr[i][j]=count;
					count++;
				}else {
					arr[i][j]=count;
					count++;
				}
			}
		}
		for(int i=0;i<l;i++) {
			arr[0][i]=0;
		}
		for(int i=0;i<l;i++) {
			arr[i][0]=0;
		}
		for(int i=size-l;i<size;i++) {
			arr[i][0]=0;
		}
		for(int i=0;i<l;i++) {
			arr[size-1][i]=0;
		}
		for(int i=size-l;i<size;i++) {
			arr[i][size-1]=0;
		}
		for(int i=0;i<l;i++) {
			arr[i][size-1]=0;
		}
		for(int i=size-l;i<size;i++) {
			arr[size-1][i]=0;
		}
		for(int i=size-l;i<size;i++) {
			arr[0][i]=0;
		}
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
