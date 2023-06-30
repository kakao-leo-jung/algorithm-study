package algorithm.study.dohyun.boj;
import java.util.*;

public class Boj_1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		str = str.toUpperCase(); 
		
		int[] num = new int[26]; 
		char ch =' ';
		int max =-1; 
		
		for(int i =0; i<str.length(); i++) {
			if('A' <= str.charAt(i) && str.charAt(i) <='Z') {
				num[str.charAt(i)-65]++;
				
			}
			
		}
		for(int i=0; i<26; i++) {
			if(max<num[i]) {
				max = num[i];
				ch = (char)(i+65);
			}			
			else if(num[i] == max)
				ch ='?';
		}
		
		System.out.println(ch);
		
	}

}
