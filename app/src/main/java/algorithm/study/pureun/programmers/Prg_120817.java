package algorithm.study.pureun.programmers;

/**
 * 프로그래머스 - 배열의 평균값
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120817
 */
public class Prg_120817 {

	public static void main(String[] args) {
		Prg_120817 sol = new Prg_120817();
		
		int[] numbers = new int[] {1,2,3,4,5,6,7,8,9,10};
        double ans = sol.solution(numbers);
        System.out.println(ans);

	}
	
	public double solution(int[] numbers) {
		double sum =0;
		for(int i=0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		double answer = 0;
		answer = sum/numbers.length;
		
        return answer;
    }

}
