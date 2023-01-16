package algorithm.study.pureun.programmers;

/**
 * 프로그래머스 - 직각삼각형 출력하기
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120823
 */
import java.util.Scanner;

public class Prg_120823 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 1; i <=n; i++) {
        	for(int j = 1; j <= i; j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
    }

}
