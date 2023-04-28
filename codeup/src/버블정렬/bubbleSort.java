package 버블정렬;

import java.util.Scanner;

public class bubbleSort {
	/*
	 * 버블 정렬이란? - 서로 인접한 두 원소를 비교하여 정렬하는 알고리즘 선택 정렬과 기본 개념이 유사하다.
	 * 
	 * 구체적인 개념? - 한 배열의 붙어있는 두 원소 중 큰 원소를 뒤로 보낸다.
	 * 
	 * { 2, 1, 3 } 이라는 배열이 있다면 2와 1을 비교한다. 2는 1보다 큰 수이고, 1보다 앞에 있기 때문에 교환이 일어난다. >>
	 * { 1, 2, 3 } 그 다음에는 2와 3을 비교한다. 3이 2보다 큰 수 이고, 2보다 뒤에 있기 때문에 교환이 일어나지 않는다.
	 *
	 * 배열의 모든 원소와 비교해서 교환을 했더라도 정렬이 되지 않았다면, 처음부터 다시 비교해서 교환한다. 한 번 회전이 일어날 때마다 가장 큰
	 * 수는 가장 뒤로 물러나기 때문에 최악의 경우 배열 n열의 -1 값만큼 회전해야 한다. 그러므로 최대 시간복잡도는 n개의 배열이 정렬될 때
	 * O(n)이다.
	 */

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
