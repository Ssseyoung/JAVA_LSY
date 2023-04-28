package 선택정렬;

import java.util.Scanner;

public class S1 {

 

	public static void main(String[] args) {

        
        int[] arr = new int[3];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) { 	// +1을 하는 이유는 자기와 비교할 필요가 없기 때문
                if(arr[i] > arr[j]) { 
                    int temp = arr[i]; 				// 값 변경해야 하기에 임시 저장
                    arr[i] = arr[j]; 					// j를 i로 변경
                    arr[j] = temp;  					// i를 j로 변경
                }
            }
        }

        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " "); 			// 정렬 후 결과 출력
        }
        sc.close();
    }

}