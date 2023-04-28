package 기초05;

import java.util.Scanner;

public class _1295 {
	public static void main(String[] args) {
		// 대문자를 소문자로, 소문자를 대문자로 변환
		// CodeChallenge2014withMSP
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		// split("구분기호")
		// : 구분기호를 기준으로 문자열을 분해하여 배열로 반환
		String[] strArr = str.split("");
		
		for (int i = 0; i < strArr.length; i++) {
			// charAt(index)
			// : index 위치의 문자를 char 타입으로 반환
			char ch = strArr[i].charAt(0);
			
			if( Character.isUpperCase(ch) ) {
			   // strArr[i] = Character.toLowerCase(ch) + "";
			   System.out.print(Character.toLowerCase(ch));
			}
			else if( Character.isLowerCase(ch) ) {
			   // strArr[i] = Character.toUpperCase(ch) + "";
				System.out.print( Character.toUpperCase(ch) );
			}
			
			else {
				System.out.print( ch );
			}
		}
//		for (int i = 0; i < strArr.length; i++) {
//			System.out.print(strArr[i]);
//		}
		sc.close();
	}
  }


