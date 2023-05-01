package 기초01;

import java.util.*;

public class _1018_split {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
    
        String a[] = sc.next().split(":");  
        System.out.println(a[0] + ":" + a[1]);

        sc.close();
    }
}

// String [] split ()   ->  문자열 자르기