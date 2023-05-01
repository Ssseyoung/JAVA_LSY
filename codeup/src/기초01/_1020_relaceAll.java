package 기초01;

import java.util.Scanner;

public class _1020_relaceAll {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String a = sc.next();
    a = a.replaceAll("-", "");

    System.out.println(a);
  }
}

// replace(),replaceAll() 함수는 대상 문자열을 원하는 문자 값으로 변환하는 함수이다.
// 변수 = 변수.replaceAll("a","b");
// a를 b로 변환
// String str = "testa1testbccc2testccc3";
// str = str.replaceAll("[^0-9]", "");      
// System.out.println(str);
// replace와 replaceAll