class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;

        answer = a + b + c;

        if(a==b || b==c || a==c){
            answer *= (a*a + b*b + c*c);

            if(a==b && b==c && a==c) {
                answer *= (a * a * a + b * b * b + c * c * c);
            }
        }

        return answer;
    }
}

// 코드 깔끔하고 좋아요