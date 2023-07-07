package algorithm.study.dohyun.boj;

import java.util.*;
public class Boj_2480 {
	public static int max(int a, int b,int c) {
		int[] arr= {a,b,c};
		int max =a;
		for(int i =0;i<arr.length;i++) {
			if(max < arr[i])
				max = arr[i];
		}
		return max;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a == b && b ==c) {
			System.out.println(10000+a*1000);
		}
		else if(a !=b && b!= c && a!=c) {
			int big = max(a,b,c);
			System.out.println(big*100);
		}
		else {
			if(a == b || b ==c)
				System.out.println(1000+b*100);
			else
				System.out.println(1000+a*100);
		}
		
			
	}

}