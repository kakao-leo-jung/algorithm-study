package algorithm.study.dohyun.boj;
import java.io.*;

public class Boj_2720 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		for(int i=0; i<num; i++) {

			int sum = Integer.parseInt(br.readLine());
			System.out.println(sum/25+" "+(sum%25)/10+" "+(sum%25)%10/5 +" "+ ((sum%25)%10)%5);
			
		}
		
	}

}
