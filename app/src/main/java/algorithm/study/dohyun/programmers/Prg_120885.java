package algorithm.study.dohyun.programmers;

public class Prg_120885 {

	public static void main(String[] args) {
		
		Prg_120885 sol = new Prg_120885();
		String ans1 = sol.solution("10", "11");
		System.out.println(ans1);

		String ans2 = sol.solution("1001", "1111");
		System.out.println(ans2);

	}
	public static String solution(String bin1,String bin2) {
		int b1 = Integer.parseInt(bin1,2);
		int b2 = Integer.parseInt(bin2,2);
		
		return Integer.toBinaryString(b1+b2);
	}

}