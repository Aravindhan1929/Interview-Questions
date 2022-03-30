package zoho;
import java.util.Scanner;
public class Problem8 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the n value:");
		int n=input.nextInt();
		System.out.println("Enter the m value:");
		int m=input.nextInt();
		int[][] arr=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=0;
			}
		}
		int choice;
		while(true) {
			System.out.println("1.Play 2.Exit..");
			choice=input.nextInt();
			switch(choice) {
			case 1:
				arr=Game(arr,n,m);
				for(int i=0;i<n;i++) {
					for(int j=0;j<m;j++) {
						System.out.print(arr[i][j]);
					}
					System.out.println();
				}
				break;
			case 2:System.exit(0);
			default:System.out.println("Enter the valid choice");
				
			}
		}

	}
	static int[][] Game(int[][] arr,int n,int m) {
		Scanner input2=new Scanner(System.in);
		System.out.println("Enter the block");
		int block=input2.nextInt();
		System.out.println("Enter the number going to add");
		int num=input2.nextInt();
		System.out.println("Enter the side number 1 or 2 If 1 the number will be filled in horizontally If 2 the number will be"
				+ "filled in vertically ");
		int path=input2.nextInt();
		System.out.println("Enter the inserting element ");
		int a=input2.nextInt();
		System.out.println("Enter the starting position ");
		int b=input2.nextInt();
		System.out.println("Enter the total length");
		int c=input2.nextInt();
		if(path==1) {
			b=isAllreadyexistAtHorizontal(arr,b,c,n,m);
			arr=moveHorizontal(arr,num,b,c);
		}else if(path==2) {
			b=isAllreadyexistAtVertical(arr,b,c,n,m);
			arr=moveVertical(arr,num,b,c);
		}else {
			System.out.println("Enter the valid path");
		}
		return arr;
	}
	static int[][] moveHorizontal(int[][] arr ,int num,int pos,int length){
		int j=pos%10;
		int i=pos/10;
		for(int k=j;k<=length;k++) {
			arr[i][k]=num;
		}
		return arr;
	}
	static int[][] moveVertical(int[][] arr,int num,int pos,int length){
		int j=pos%10;
		int i=pos/10;
		for(int k=i;k<=length;k++) {
			arr[k][j]=num;
		}
		return arr;
	}
	static int isAllreadyexistAtHorizontal(int[][] arr,int pos,int length,int n,int m) {
		int a=0;
		int j=pos%10;
		int i=pos/10;
		if(i+length>m) {
			System.out.println("Enter the valid input");
			System.out.println("Start the Game once again");
			Game(arr,n,m);
		}else {
		for(int k=j;k<=length;k++) {
			if(arr[i][k]!=0) {
				a=(a*10)+i;
				a=(a*10)+k+1;
				if(k+length>=n) {
					System.out.println("Enter the valid input");
					System.out.println("Start the Game once again");
					Game(arr,n,m);
				}
			}
		}
		}
		if(a==0) {
			return pos;
		}else {
			return a;
		}
	}
	static int isAllreadyexistAtVertical(int[][] arr,int pos,int length,int n,int m) {
		int a=0;;
		int j=pos%10;
		int i=pos/10;
		if(j+length>m) {
			System.out.println("Enter the valid input");
			System.out.println("Start the Game once again");
			Game(arr,n,m);
		}else {
		for(int k=i;k<=length;k++) {
			if(arr[k][j]!=0) {
				a=(a*10)+k+1;
				if(k+length>=m) {
					System.out.println("Enter the valid input");
					System.out.println("Start the Game once again");
					Game(arr,n,m);
				}
				a=(a*10)+j;
			}
		}
		}
		if(a==0) {
			return pos;
		}else {
			return a;
		}
	}
}
