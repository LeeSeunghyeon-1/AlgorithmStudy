package week003.day4;


class Solution {
    public int solution(int a, int b) {
            int answer = 0;

            String num1 = Integer.toString(a);
            String num2 = Integer.toString(b);
            String result1 = num1 + num2;
            String result2 = num2 + num1;


            if(Integer.valueOf(result1) > Integer.valueOf(result2) || result1.equals(result2) ) answer = Integer.valueOf(result1);
            else if(Integer.valueOf(result1) < Integer.valueOf(result2)) answer = Integer.valueOf(result2);
            return answer;
    }
}

// 경우의 수를 가장 관리 잘한 코드같아요
// 꼼꼼한 코드 멋쪄욤









/*
public class LJT_04 {
    public static void main(String[] args) {
        Solution p = new Solution();
        System.out.print(p.solution(21,21));


    }
}


 */