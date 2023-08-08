package algorithm.study.dohyun.programmers;

public class Prg_86051 {
    public static void main(String[] args){

        Prg_86051 sol = new Prg_86051();
        int[] nums = {1,2,3,4,6,7,8,0};
        int ans = sol.solution(nums);
        System.out.println(ans);

        int[] nums2 = {5,8,4,0,6,7,9};
        int ans2 = sol.solution(nums2);
        System.out.println(ans2);

    }
    public int solution(int[] numbers) {
        int allsum = 45;
        for(int i=0;i<numbers.length;i++)
            allsum -= numbers[i];
        return allsum;
    }
}

