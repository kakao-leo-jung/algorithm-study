package algorithm.study.dohyun.boj;
import java.util.Scanner;

public class Boj_2941 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		String[] alpha ={ "c=","c-","dz=","d-","lj","nj","s=","z="};
		
		for(int i=0; i<alpha.length; i++) {
			if(str.contains(alpha[i])) {
				str = str.replace(alpha[i],"a");
			}
		}
		System.out.print(str.length());
		
	}

}
