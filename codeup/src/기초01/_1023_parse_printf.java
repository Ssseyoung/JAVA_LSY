package 기초01;

import java.util.Scanner;

public class _1023_parse_printf {
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    String[] value = sc.next().split("[.]");
	    int a = Integer.parseInt(value[0]);
	    int b = Integer.parseInt(value[1]);

	 // System.out.printf("%d\n%d", a, b);
	    System.out.println(a);
	    System.out.println(b);
	  }
	}
		// parseInt : 문자열 타입의 숫자를 int 타입으로 변환
		
		// Byte.parseByte();
		// Short.parseShort();
		// Integer.parseInt();
		// Long.parseLong();
		// Float.parseFloat();
		// Double.parseDouble();
		// ------------------------------

		// printf("문자열", a, b); 	
		//	: 원하는 데이터 형식으로 출력

		// %b  	    :   boolean 형식으로 출력
		// %d		:	정수 형식으로 출력
		// %o		:	8진수 정수의 형식으로 출력
		// %x or %X	:	16진수 정수의 형식으로 출력
		// %f		:	소수점 형식으로 출력
		// %c		:	문자형식으로 출력

