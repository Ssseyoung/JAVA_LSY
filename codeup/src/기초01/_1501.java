package 기초01;

import java.util.Scanner;

public class _1501 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		
		int k = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = k++;
				System.out.print( arr[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
