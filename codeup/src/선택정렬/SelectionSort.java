package 선택정렬;

import java.util.Scanner;

public class SelectionSort {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 배열의 길이 값
		int[] arr = new int[n]; // n이 5라는 값을 입력 받으면 5열을 가진 arr 배열이 생성된다.

		for (int i = 0; i < n; i++) { // n열의 배열 마다 각각의 입력 값을 지정한다.
			arr[i] = sc.nextInt();
		}

		Sort(n, arr); // 버블 정렬 메소드 호출

		print(arr); // 배열 출력 메소드 호출

		sc.close();

	}

	// 버블 정렬하는 메소드
	public static void Sort(int n, int[] arr) {
		int temp; // 임시변수
		int flag = 0; // 교환 플래그 (교환이 일어났을 경우 1, 아니면 0)
		for (int j = n - 1; j > 0; j--) { // n-1부터 0까지 j가 감소
			for (int i = 0; i < j; i++) { // j가 감소하면서 0이 될 때까지 arr[0]과 arr[j] 사이를 버블 정렬한다.
				if (arr[i] > arr[i + 1]) {
					temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
					flag = 1; // 교환이 일어남
				} else flag = 0; // 교환이 일어나지 않음
			}
			if (flag == 0) { // 모든 요소의 비교 과정에서 교환이 일어나지 않으면 탈출
				break;
			}
		}
	}

	public static void print(int[] arr) {
//		arr 배열 출력문
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
