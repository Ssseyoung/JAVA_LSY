package 기초02;

import java.util.*;

public class _1018 {
    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
    
        int a = s.nextInt();
        char c = s.next().charAt(0);
        int b = s.nextInt();
        
        System.out.print(a+""+(char)c+b+"");
//      System.out.print(String.valueOf(a)+(char)c+String.valueOf(b));
        
        s.close();
    }
}
