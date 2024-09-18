package Practice1;

import java.util.Scanner;

public class TargetInArray {

	public static void main(String[] args) {
		int[] arr= new int[5];
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an array values");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the targe: ");
		int target=scan.nextInt();
		for(int i=0;i<arr.length;i++) {
			for(int j=arr.length-1;j>=0;j--) {
				if(arr[i]+arr[j]==target) {
					System.out.println(i+" "+j);
					break; 
				}
				System.out.println();
			}
		} 
		scan.close();
	}

}
