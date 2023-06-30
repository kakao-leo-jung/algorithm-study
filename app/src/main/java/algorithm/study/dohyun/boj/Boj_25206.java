package algorithm.study.dohyun.boj;
import java.util.*;
public class Boj_25206 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double add = 0;
		int num =20;
		double sum = 0;
		
		String[] grade = {"A+","A0","B+","B0","C+","C0","D+","D0","F","P"};
		double[] igrade= {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0};
		
		for(int i =0;i<20; i ++) {
			
			String str = sc.nextLine();
			String[] arr = new String[3];
			arr = str.split(" ");
			
			double score = Double.parseDouble(arr[1]); //학점
			
			for(int j =0; j<grade.length; j++) {
				if(arr[2].equals(grade[j]) ) {
					if(grade[j]=="P") {
						break;
					}
					else{
						sum = sum+score;
						score = score*igrade[j];
					}
					add = add+score;
				}
					
			} 
			
		}
		add=add/sum;
		System.out.printf("%.6f\n", add);
	}
}
