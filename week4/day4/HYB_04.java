package week4.day4;

public class HYB_04 {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;

        if(ineq.equals("<")&&eq.equals("=")){
            if(n<m||n==m)
                return 1;
            else
                return 0;
        }
        else if(ineq.equals("<")&&eq.equals("!")){
            if(n<m)
                return 1;
            else
                return 0;
        }


        if(ineq.equals(">")&&eq.equals("=")){
            if(n>m||n==m)
                return 1;
            else
                return 0;
        }
        else if(ineq.equals(">")&&eq.equals("!")){
            if(n>m)
                return 1;
            else
                return 0;
        }


        return answer;
    }
}

// 가독성이 정말 좋아요!