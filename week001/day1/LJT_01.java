package week001.day1;

import java.util.Scanner;

public class LJT_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        int A = a.length();

        if(A>=1 || A<=1000000) System.out.print(a);
        else return;
    }
}

// 제한사항 적용하신 점 좋아요~!