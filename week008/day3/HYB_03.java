package week008.day3;

public class HYB_03 {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;

        answer=(x1||x2)&&(x3||x4);

        return answer;
    }
}
