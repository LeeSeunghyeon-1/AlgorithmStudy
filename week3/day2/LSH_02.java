package week3.day2;

public class LSH_02 {
    class Solution {
        public String solution(String[] arr) {
            StringBuilder sb = new StringBuilder();
            for (String s : arr) {
                sb.append(s);
            }
            String answer = sb.toString();
            return answer;
        }
    }

}