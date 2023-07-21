import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int p = 0;
        int q = 0;
        int r = 0;
        int cnt = 0;
        int arr[] = {a,b,c,d};
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();

        if(a==b&&b==c&c==d&d==a) answer = 1111*a;
        else if(arr[0] != arr[1] && arr[1] != arr[2] && arr[2] != arr[3] && arr[3] != arr[0] ) answer = arr[0];
        else{
            for(int i =0; i<3; i++){
                if(arr[i] == arr[i+1]){
                    cnt += 1;
                    list.add(arr[i]);
                }
            }
            System.out.println("cnt = " + cnt);

            if (cnt == 1){
                for(int i=0;i<arr.length;i++){
                    if(list.get(0) != arr[i]){
                        list.add(arr[i]);
                    }
                }
                q = list.get(1);
                r = list.get(2);
                answer = q*r;
            }
            else if(list.get(0) != list.get(1)){
                p = list.get(0);
                q = list.get(1);

                answer = Math.abs((p+q) * (p-q));
            }
            else if(list.get(0) == list.get(1)){
                p = list.get(0);
                for(int i=0; i<arr.length;i++){
                    if(p!=arr[i]) {
                        q = arr[i];
                        break;
                    }
                }

                answer = (10*p+q) * (10*p+q);
            }
        }


        return answer;
    }
}

public class Main {
    public static void main(String[] args) {

        Solution p = new Solution();


        int num[] = {16,6,5,3,12,14,11,11,17,12,7};

        System.out.println(p.solution(2,5,2,6));

        //System.out.println(Arrays.toString(p.solution(2,2,2,2)));
        }
    }