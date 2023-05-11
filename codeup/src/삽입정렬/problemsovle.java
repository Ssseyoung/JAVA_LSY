package 삽입정렬;

import java.util.Scanner;

public class problemsovle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); 				// 배열의 길이를 입력 받습니다
		int a[] = new int[n]; 				// 입력 받은 정수만큼 배열의 열을 생성합니다
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt(); 			// 배열의 열 개수만큼 a[i]에 입력 값을 지정합니다
		}
		
		for (int i = 1; i < n; i++) {
			int key = a[i];
			int j = i - 1;
			while (j >= 0 && key < a[j]) { 	// 키 값과 키 값의 왼쪽 값을 비교하고, 키 값이 더 작으면,
				a[j + 1] = a[j]; 		 	// 오른쪽으로 한 칸 이동 시킵니다. 
				j--;						// 올바르게 배치될 때까지 계속 반복합니다.
			}
			a[j + 1] = key;					// 정렬이 끝난 후, 키 값은 가장 작은 수의 오른쪽에 배치 되어야
		}									// 하기 떄문에 a[j + 1]에 키 값을 지정합니다.
		
		for (int element : a) {				// for each 문을 사용하여 각 a 배열의 요소들을 출력합니다.
			System.out.println(element);
		}
		sc.close();

	}

}
