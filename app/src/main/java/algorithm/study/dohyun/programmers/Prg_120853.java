package algorithm.study.dohyun.programmers;

public class Prg_120853 {

    public static void main(String[] args) {

        Prg_120853 sol = new  Prg_120853();

        String str1 = "1 2 Z 3";
        int ans1 = sol.solution(str1);
        System.out.println(ans1);

        String str2 = "-1 -2 -3 Z";
        int ans2 = sol.solution(str2);
        System.out.println(ans2);

    }


    public int solution(String s) {
        int ans = 0;
        String[] str = s.split(" ");
        for(int i=0; i<str.length;i++){
            if(str[i].equals("Z")){
                ans -= Integer.parseInt(str[i-1]);
            }
            else{
                ans += Integer.parseInt(str[i]);
            }
        }
        return ans;
    }


}
