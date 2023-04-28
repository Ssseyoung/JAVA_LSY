package 선택정렬;

import java.util.Scanner;

public class SelectionSort {
	/*
	 * 선택 정렬이란? - 한 번의 배열 탐색에서 가장 작은 원소의 '위치'를 찾고, 그 위치와 배열의 가장 첫 번째 원소부터 차례로 바꿔주는 방식을 
	 * 사용(오름 차순으로 정렬하는 경우)하는 정렬 방식이다.
	 * 
	 * 구체적인 개념? - 말 그대로 큰 원소나 작은 원소를 선택하고 그 위치를 바꿔주기 때문에 선택 정렬이라는 이름을 사용한다.
	 * 
	 * 선택 정렬의 이해
     *  -> 버블 정렬과 마찬가지로 총 반복 횟수 = n(n-1)/2가 된다. 따라서, 선택 정렬의 시간 복잡도는 O(n^2)이다.
	 *  -> 선택 정렬은 어떤 정렬이 오더라도 비교하는 방식이 같기 때문에, 일반적인 상황에서 비슷한 성능을 보유한다.  
	 *  ->버블 정렬과 마찬가지로 직관적으로 이해가 편하고, 불필요하게 원소들을 교체하는 작업이 없기 때문에 버블 정렬보다 
	 *   '일반적인 상황'에서 빠른 성능을 보이지만 여전히 시간 복잡도가 O(n^2)이기 때문에 실전에서 사용하기 힘든 정렬이다.
	 */
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); 	// 배열의 길이 값
		int[] arr = new int[n]; // n이 5라는 값을 입력 받으면 5열을 가진 arr 배열이 생성된다.

		for (int i = 0; i < n; i++) { // n열의 배열 마다 각각의 입력 값을 지정한다.
			arr[i] = sc.nextInt();
		}

		Sort(n, arr); // 버블 정렬 메소드 호출

		

		sc.close();

	}

	// 버블 정렬하는 메소드
	public static void Sort(int n, int[] arr) {
		
		int flag = 0; // 교환 플래그 (교환이 일어났을 경우 1, 아니면 0)
		for(int i = 0; i<arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) { // +1을 하는 이유는 자기와 비교할 필요가 없기 때문
				if(arr[i] > arr[j]) { // '>' 일 경우 오름차순 '<' 일 경우 내림차순
					int temp = arr[i]; // 값 변경해야 하기에 임시 저장
					arr[i] = arr[j]; // j를 i로 변경
					arr[j] = temp;  // i를 j로 변경
				}
			}
		}
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " "); // 정렬 후 결과 출력
		}
		
	



		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
