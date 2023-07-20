package algorithm.study.dohyun.algorithm;
import java.util.*;
public class bfs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 점의 개수
        int m = sc.nextInt(); // 변의 개수
        int s = sc.nextInt(); // 탐색 시작 노드

        boolean[] visited = new boolean[n+1]; //방문 했는지
        int[][] adjArray = new int[n+1][n+1];

        for( int i=0; i<m ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            adjArray[a][b] = 1; // a와 b를 연결하는 길이 존재.
            adjArray[b][a] = 1;
        }

        bfs_array(s,adjArray,visited);


    }
    public static void bfs_array(int v, int[][] adjArray,boolean[] visited){
        Queue<Integer> q = new LinkedList<>();
        int n = adjArray.length -1;

        q.add(v);
        visited[v] = true;

        while(! q.isEmpty()){
            v = q.poll();
            System.out.print(v + " ");

            for(int i=1; i<n+1; i++){
                if(adjArray[v][i] != 0 && !visited[i]){
                    q.add(i);
                    visited[i] = true;
                }
            }

        }

    }
}
