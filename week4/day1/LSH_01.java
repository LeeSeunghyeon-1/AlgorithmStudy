package week4.day1;

public class LSH_01 {
    public int solution(int num, int n) {
        if(num % n == 0){
            return 1;
        } else {
            return 0;
        }
    }
}