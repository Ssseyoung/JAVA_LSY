package Day01;

public class Ex11_Long {
	
	public static void main(String[] args) {
		// int (4byte : 32bits) : 2^32개 : 약 42억개
		// iny 수 표현 범위 : -21억... ~ 21억...
		
		// long (8byte : 64bits) : 2^64개
		long ln1 = 1000;			// (long) = (int)
		long ln2 = 2100000000;		// (long) = (int)
		// long 타입 리터럴 : 숫자L
		long ln3 = 2200000000L;
		
		int max = Integer.MAX_VALUE;	// int 형의 최대값 (21억...)
		int min = Integer.MIN_VALUE;	// int 형의 최소값 (-21억...)
		
		System.out.println("int의 최대값 : " + max);
		System.out.println("int의 최소값 : " + min);
		
		System.out.println("ln1 : " + ln1);
		System.out.println("ln2 : " + ln2);
		System.out.println("ln3 : " + ln3);
 		
		
	}

}
