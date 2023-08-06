package algorithm.study.dohyun.programmers;
import java.util.*;
public class Prg_42746 {

	public static void main(String[] args) {
		Prg_42746 sol = new Prg_42746();
		int[] num = {6,10,2};
		String ans = sol.solution(num);
		System.out.println(ans);
	}

	public String solution(int[] numbers) {
		String ans = "";
		String[] tmp = new String[numbers.length];

		for(int i=0; i< numbers.length; i++)
			tmp[i] = numbers[i] +"";

		Comparator<String> com = (s1,s2) -> (s2+s1).compareTo(s1+s2);
		Arrays.sort(tmp,com);

		for(String i: tmp)
			ans += i;

		return (ans.charAt(0) == '0') ? "0" : ans;

	}
}

