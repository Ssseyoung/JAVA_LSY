package 선택정렬;

	
import java.util.Arrays;
import java.util.Scanner;

	public class SelectionSort3 {
		static int[] nums;

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			nums = new int[5];
			for (int i = 0; i < 5; i++) {
				int n = sc.nextInt();
			System.out.println("<정렬 전>");
			System.out.println(Arrays.toString(nums));
			
			for(int n1 = 0; i < nums.length - 1; i++) {
				// 현재 탐색에서 가장 앞의 원소를 초기 값으로 설정해둔다.
				int MinIndex = i;
				// 탐색을 진행하며, 가장 작은 값을 찾는다.
				for(int j = i + 1; j < nums.length; j++) {
					if(nums[MinIndex] > nums[j])
						MinIndex = j;
				}
				// 탐색이 완료되면 가장 작은 값을 가장 앞의 원소와 가장 작은 원소의 위치를 바꾸어준다.
				int temp = nums[MinIndex];
				nums[MinIndex] = nums[i];
				nums[i] = temp;
			}
			
			System.out.println("<정렬 후>");
			System.out.println(Arrays.toString(nums));
		}
	
	}
}
