package algorithm.study.dohyun.boj;
import java.util.*;
public class Boj_2563 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //색종이 수 
		int[][] arr = new int[100][100];
		int ans=0;
		
		for(int i=0; i<n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for(int j=0;j<10;j++) {
				for(int h = 0;h<10; h++) 
					arr[x+j][y+h]=1;
			}
		}
		for(int i=0;i<100;i++) {
			for(int j =0;j<100;j++) {
				if(arr[i][j]==1)
					ans++;
			}
		}
		System.out.println(ans);
		
	}

}
