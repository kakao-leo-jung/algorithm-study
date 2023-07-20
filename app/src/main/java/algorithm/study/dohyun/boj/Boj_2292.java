package algorithm.study.dohyun.boj;
import java.util.*;
public class Boj_2292 {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 1;
		int tmp = 1;
		
		if(n == 1)	{
			System.out.println(ans);
			return;
		}
		
			
		while(tmp < n) {
			tmp += (ans*6);
			ans++;
		}
				
		System.out.println(ans);
	}

}
