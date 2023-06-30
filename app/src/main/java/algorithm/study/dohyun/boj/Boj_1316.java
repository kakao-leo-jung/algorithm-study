package algorithm.study.dohyun.boj;
import java.util.*;
public class Boj_1316 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int ans = num;
		
		for(int i=0; i< num; i++) {
			String str = sc.next();
			boolean[] arr = new boolean[26];
			
			for(int j=0; j<str.length()-1; j++) {
				
				if(str.charAt(j) != str.charAt(j+1)) {
					if(arr[str.charAt(j+1)-97] == true) {
						ans--;
						break;
					}
				}
				arr[str.charAt(j)-97]=true;
			}
			
			
		}
		
		System.out.print(ans);
	}

}
