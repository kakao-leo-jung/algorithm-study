package algorithm.study.dohyun.boj;
import java.util.*;
// 자연수 N,M 이 주어졌을 때 1~N까지 중복없이 길이가 m인 수열 을 모두 고르는 것
public class Boj_15649 {
    static boolean visited[];
    static int[] arr;
    static int n,m;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[m];
        visited = new boolean[n];
        back(0);

    }
    public static void back(int leng){
        if(leng == m) {
            for (int i : arr)
                System.out.print(i + " ");
            System.out.println();
            return;
        }
        for(int i =0; i< n; i++){
            if(!visited[i]){
                visited[i] = true;
                arr[leng] = i+1;
                back(leng+1);
                visited[i] = false;

            }
        }



    }
}
