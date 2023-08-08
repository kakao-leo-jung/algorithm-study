package algorithm.study.dohyun.programmers;

public class Prg_77884 {
    public static void main(String[] args){
        
        Prg_77884 sol = new Prg_77884();
        int left = 13;
        int right = 17;
        int result = sol.solution(left,right);
        System.out.println(result);
        
        int left2 = 24;
        int right2 = 27;
        int result2 = sol.solution(left2,right2);
        System.out.println(result2);
        
    }
    private boolean divisor(int num){

        int n = 0;
        for(int i=1 ;i<=num ; i++){
            if(num%i == 0)
                n++;
        }
        if(n%2 == 0)
            return true;
        return false;

    }
    public int solution(int left, int right) {
        int ans =0;

        for(int i=left; i< right+1; i++){
            if(divisor(i))
                ans += i;
            else
                ans -= i;
        }
        return ans;
    }
}

