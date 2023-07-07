package algorithm.study.dohyun.boj;
import java.util.*;
import java.io.*;
public class Boj_11005 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		
		while(N > 0) {

			int tmp = N%B;
			char temp = ' ';
			if(10 <= tmp && tmp <=35) {
				temp = (char)(tmp+55);
				sb.append(temp);
			}else
				sb.append(tmp);
				
			N = N/B;
		}
		sb.reverse();
		
		
		System.out.print(sb);
		
	}

}
