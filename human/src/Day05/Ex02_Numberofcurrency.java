package Day05;

import java.util.Scanner;

/**
 *  화폐 매수 구하기
 * 
 *	금액 		:   534760
 *	50000	: 	10개
 *	10000	:	 3개
 *	5000	:	 0개
 *	1000	:	 4개
 *	500		:	 1개
 *	100		:	 2개
 *	50		:	 1개
 *	10		:	 1개
 *	5		:	 0개
 *	1		:	 0개
 */
public class Ex02_Numberofcurrency {
	/*
	    (순서도)
	    1. 필요한 변수 선언
	    - (입력 금액), (화폐매수), (화폐단위)
	    
	    2. (입력금액) 입력
	    
	    3. 화폐매수 계산
	      [조건] : 큰 화폐 단위부터 계산한다.
	      
	     3-1. 화폐매수 계산
	       	 10			= 534760  / 50000
	         (화폐매수)	= (입력금액) / (화폐단위)
	      
	     3-2. 잔액 계산
	         34760		= 534760  -	(50000*10)
	      i) (잔액)		= (입력금액) /	(화폐단위*화폐매수)
	  	  ii)(잔액)		= (입력금액) %	(화폐단위)
	  	  
	  	 3-3. 화폐단위 변환
	  	 	  번갈아 가면서, /5, /2 연산을 반복한다.
	  	 	 50000 -> 10000		/5
	  	 	 10000 -> 5000		/2
	  	 	 5000  -> 1000		/5
	  	 	 1000  -> 500		/2
	  	 	 500   -> 100		/5
	  	 	 100   -> 50		/2
	  	 	 50    -> 10		/5	
	  	 	 10    -> 5			/2
	  	 	 5     -> 1			/5
	  	 	 (화폐단위) = (화폐단위) /5
	  	 	 (화폐단위) = (화폐단위) /2
	  	 	 
	  	4. 3번의 과정을 반복
	  	 - 반복조건 : (화폐단위)가 1보다 크거나 같으면 반복
	  	 
	  	5. 3-1에서 구한 화폐매수를 출력한다.
	  	
	 */

	public static void main(String[] args) {
		
		// 1
		int input;				// 입력금액
		int count;				// 화폐매수
		int money = 50000; 		// 화폐단위 : 큰 화폐단위부터 시작
		boolean sw = true;		// 화폐단위를 전환하는 변수
		
		// 2
		System.out.print("금액 : ");
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		
		// 4
		while( money >= 1) { 
			
			// 3-1
			count = input / money;
			System.out.println(money + "\t : " + count + "개");
			
			// 3-2
			input = input - (money*count);
			// or input = % money;
			
			// 3-3
			if ( sw ) {
				money = money / 5;
			}
			else {
				money = money / 2;
			}
			sw = !sw;
			
		}
		sc.close();
	}
