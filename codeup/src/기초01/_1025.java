package 기초01;

import java.util.Scanner;

public class _1025 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = a % (int) Math.pow(10, i + 1);
						// % : 나눈 나머지
						// 강제 형 변환 double -> int
			a -= arr[i];
		}

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.printf("[%d]\n", arr[i]);
		}
	}
}