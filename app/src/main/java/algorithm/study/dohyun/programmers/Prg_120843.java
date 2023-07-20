package algorithm.study.dohyun.programmers;

public class Prg_120843 {

	public static void main(String[] args) {
		Prg_120843 sol = new Prg_120843();
		int[] arr = {1,2,3,4};
		int k = 2;
		System.out.println(sol.solution(arr, k));
		
		int[] arr2 = {1,2,3,4,5,6};
		int k2 = 5;
		System.out.println(sol.solution(arr2, k2));

	}

    public int solution(int[] numbers, int k) {
    	   
        int len = numbers.length;
        return numbers[(2*(k-1))%len];
    }
}