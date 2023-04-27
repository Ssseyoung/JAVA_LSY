package Day01;

import java.util.Scanner;

public class Ex06_Triangle2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형의 넓이");
		System.out.print("밑변 : ");
		double a = sc.nextDouble();
		
		System.out.print("높이 : ");
		double b = sc.nextDouble();
		
		double area = a * b;
		System.out.print("넓이 : " + area);
		
	}
}