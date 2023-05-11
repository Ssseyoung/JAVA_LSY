package Day05;

import java.util.Iterator;
import java.util.Scanner;

public class Ex04_Matrix2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M, N, O;
		System.out.print("M : ");
		M = sc.nextInt();
		System.out.print("N : ");
		N = sc.nextInt();
		System.out.print("O : ");
		O = sc.nextInt();
		
		int arr[][][] = new int[M][N][O];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
				arr[i][j][k] = sc.nextInt();
			}
		  }		
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
				System.out.print(arr[i][j][k] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
  }
}
