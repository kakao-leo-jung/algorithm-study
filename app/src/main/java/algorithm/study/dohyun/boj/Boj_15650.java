package algorithm.study.dohyun.boj;
import java.util.*;
public class Boj_15650 {
    static int n,m;
    static boolean[] visited;
    static int[] arr;
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[m];
        visited = new boolean[n];

        dfs(0,0);

    }
    public static void dfs(int depth, int start){
        if( depth == m ){
            for(int i: arr)
                System.out.print(i+" ");
            System.out.println();
            return;
        }
        for(int i=start; i<n ; i++){
            if( !visited[i] ){
                visited[i] = true;
                arr[depth] = i+1;
                dfs(depth+1,i+1);
                visited[i] = false;
            }
        }


    }
}
