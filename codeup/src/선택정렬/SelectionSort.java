package 선택정렬;

import java.util.Scanner;

public class SelectionSort {
	/*
	 * 선택 정렬이란? - 현재 위치에 들어갈 데이터를 찾아 선택하는 알고리즘이다.
	 * 
	 * 구체적인 개념? - 선택 정렬이란 한 번의 배열 탐색에서 가장 작은 원소의 '위치'를 찾고, 
	 * 				그 위치와 배열의 가장 첫 번째 원소부터 차례로 바꿔주는 방식을 사용
	 * 				(오름 차순으로 정렬하는 경우)하는 정렬 방식이다.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();  	// 배열의 길이 값
		int[] arr = new int[n];	// n이 5라는 값을 입력 받으면 5열을 가진 arr 배열이 생성된다.

		for (int i = 0; i < n; i++) {	// n열의 배열 마다 각각의 입력 값을 지정한다.
			arr[i] = sc.nextInt();
		}
		Sort(n, arr); 					// 버블 정렬 메소드 호출
		print(arr); 					// 배열 출력 메소드 호출
		sc.close();
	}
	// 선택 정렬하는 메소드
	public static void Sort(int n, int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) { 
			// 현재 탐색에서 가장 앞의 원소를 초기 값으로 설정해둔다.
			int MinIndex = i; 
			// 탐색을 진행하며, 가장 작은 값을 찾는다.
		for (int j = i + 1; j < arr.length; j++) {
			if(arr[MinIndex] > arr[j])
				MinIndex = j;
		}
		// 탐색이 완료되면 가장 작은 값을 가장 앞의 원소와 가장 작은 원소의 위치를 바꾸어준다.
		int temp = arr[MinIndex];
		arr[MinIndex] = arr[i];
		arr[i] = temp;
		}
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {		// arr 배열 출력문
			System.out.println(arr[i]);
		}
	}
}
