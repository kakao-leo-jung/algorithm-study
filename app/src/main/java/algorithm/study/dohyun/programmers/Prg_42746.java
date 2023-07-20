package algorithm.study.dohyun.programmers;

public class Prg_42746 {

	public static void main(String[] args) {
		Prg_42746 sol = new Prg_42746();
		int[] num = {6,10,2};
		String ans = sol.solution(num);
		System.out.println(ans);
	}
	// string 으로 변환 -> 가장 앞자리 수 비교 해서 -> 붙이
    public String solution(int[] numbers) {
        String answer = "";
      
        String[] str = new String[numbers.length];
        for(int i=0; i<numbers.length; i++) str[i] = Integer.toString(numbers[i]);	
    
        
        
        return answer;
    }
}

