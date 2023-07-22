package algorithm.study.dohyun.algorithm;
// DFS = Depth First Search 깊이 우선 탐색
// 인접행렬 - 재귀함수 이용
import java.util.*;
public class dfs_array {
    static int n;
    static int m;
    static int f;
    static int[][] arr;
    static boolean[] visited;
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        f = sc.nextInt();

        arr = new int[n + 1][m + 1];
        visited = new boolean[n + 1];

       for(int i=0; i<m; i++){
           int a = sc.nextInt();
           int b = sc.nextInt();

           arr[a][b] = 1;
           arr[b][a] = 1;
       }
       dfs(f);
    }
    public static void dfs(int f){
        visited[f] = true;
        System.out.print(f + " ");
        for(int i=1; i <= arr.length -1; i++){
            if( !visited[i] && arr[f][i] == 1){
                dfs(i);
            }
        }
    }
}
