package algorithm.study.dohyun.boj;
import java.util.Scanner;
public class Boj_2738 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] first = new int[n][m];
		int[][] second = new int[n][m];
		
		for(int i =0;i<n;i++) {
			for(int j =0;j<m;j++) {
				first[i][j] = sc.nextInt();
			}
		}
		for(int i =0;i<n;i++) {
			for(int j =0;j<m;j++) {
				second[i][j] = sc.nextInt();
			}
		}
		
		for(int i =0;i<n;i++) {
			for(int j =0;j<m;j++) {
				first[i][j] += second[i][j]; 
			}
		}
		
		for(int i =0;i<n;i++) {
			for(int j =0;j<m;j++) {
				System.out.print(first[i][j] + " ");
			}
			System.out.println();
		}

	}

	                                                                                                   
}                                                                               