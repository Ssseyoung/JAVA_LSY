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

// String str = "testa1testbccc2testccc3";
// str = str.replaceAll("[^0-9]", "");      // 변수 = 변수.replaceAll("a","b");
// System.out.println(str);
// replace와 replaceAll