package zoho;
import java.util.Scanner;
public class Problem2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the range of the fibonacci series : ");
		int range=input.nextInt();
		System.out.println(fibonacci_series(range));
	}
	static int fibonacci_series(int range) {
		int sum=0;
		int n1=0,n2=1,n3=0;
		if(range==1 || range==2) {
			return sum;
		}else {
		for(int i=2;(n1+n2)<range;i++) {
			n3=n1+n2;
			if(n3%2==0) {
				sum+=n3;
				n1=n2;
				n2=n3;
			}else {
				n1=n2;
				n2=n3;
			}
		}
		return sum;
		}
	}

}
