package algorithm.study.dohyun.boj;
import java.util.*;
public class Boj_2745 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int B = sc.nextInt();
		int result  = 0;
		int tmp = 1;
		for(int i=N.length()-1;i>=0;i--) {
			
			char a = N.charAt(i);
	
			
			if('A'<=a && a<='Z'){
				result += (a-55)*tmp;
			}
			else
				result += (a-'0')*tmp;
			tmp =tmp*B;
		}
		
		System.out.println(result);
	}

}
