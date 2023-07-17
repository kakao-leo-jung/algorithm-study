package algorithm.study.dohyun.boj;
import java.util.*;
import java.io.*;
public class Boj_2869 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		int tmp = (v-a)/(a-b);
		if((v-a)%(a-b)!=0)
			tmp++;
		System.out.println(tmp+1);
		
	}

}

