package algorithm.study.dohyun.programmers;


/**
 * 프로그래머스 - 중앙값 구하
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120811
 */


public class Prg_120811 {

	public static void main(String[] args) {
		
		Prg_120811 sol = new Prg_120811() ;
		
		int[] num1 = new int[] {1, 2, 7, 10, 11};
		int ans1 = sol.solution(num1);
		System.out.println(ans1);
		
		int[] num2 = new int[] {9, -1, 0};
		int ans2 = sol.solution(num2);
		System.out.println(ans2);
		
	}

	
    public int solution(int[] arr) {
        int answer = 0;
		
		for(int i = 0;i<arr.length; i++) {
			for(int j =0; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
				
			}
		}
		
		answer = arr[arr.length/2];
        return answer;
    }


}
