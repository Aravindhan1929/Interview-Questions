package zoho;
import java.util.Scanner;
public class Problem3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int size=input.nextInt();
		int multiplyby3=1;
		int multiplyby5=1;
		for(int i=1;i<=size;i++) {
			if(multiplyby3*3==i && multiplyby5*5==i) {
				System.out.println("ThreeFive");
				multiplyby3++;
				multiplyby5++;
			}else if(multiplyby3*3==i) {
				multiplyby3++;
				System.out.println("Three");
			}else if(multiplyby5*5==i) {
				multiplyby5++;
				System.out.println("Five");
			}else {
				System.out.println(i);
			}
		}

	}

}
