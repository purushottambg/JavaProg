package Basic;
import java.util.Scanner;
public class Swap {
	public static void main(String[] args){
		int A,B;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter value for A: ");
		A = scan.nextInt();
		System.out.print("Enter value for B: ");
		B = scan.nextInt();
		int temp = A;
		A = B;
		B = temp;
		System.out.print("Values after swap A:"+A+" B:"+B);
		scan.close();
	}
}
