package week009.day3;

public class LSH_03 {
    public int solution(String number) {
        int answer = 0;
        for(int i = 0; i<number.length(); i++){
            answer += Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        return answer % 9;
    }
}