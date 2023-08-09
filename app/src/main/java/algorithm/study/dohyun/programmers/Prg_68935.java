package algorithm.study.dohyun.programmers;

public class Prg_68935 {
    public static void main(String[] args){

        Prg_68935 sol = new Prg_68935();
        int n1 = 45;
        int ans = sol.solution(n1);
        System.out.println(ans);

        int n2 = 125;
        int ans2 = sol.solution(n2);
        System.out.println(ans2);

    }
    public int solution(int n) {
        int ans = 0;
        String three = "";
        while(n>0){
            three += (char) (n%3 +'0');
            n /= 3;
        }

        int tmp = 1 ;
        for(int i=three.length()-1; i>=0; i--){

            ans += (int)(three.charAt(i) -'0') * tmp ;
            tmp *= 3;
        }
        return ans;
    }
}
