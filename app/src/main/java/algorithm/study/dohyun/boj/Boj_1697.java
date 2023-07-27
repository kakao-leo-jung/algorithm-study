package algorithm.study.dohyun.boj;
import java.util.*;
import java.io.*;
public class Boj_1697 {
    static int n,k;
    static int[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        visited = new int[100001];
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        if( n == k )
            System.out.println(0);
        else
            bfs(n);

    }
    public static void bfs(int n){

        Queue<Integer> q = new LinkedList<>();
        q.add(n);
        visited[n] = 1;

        while( !q.isEmpty() ){
            int tmp = q.poll(); // 5

            for(int i=0;i<3;i++){

                int next;

                if(i == 0)
                    next = tmp*2;
                else if(i ==1)
                    next = tmp + 1;
                else
                    next = tmp - 1;


                if( k == next ){
                    System.out.println( visited[tmp] );
                    return;
                }


                if( visited[next] == 0 && next<visited.length && 0<= next ){
                    visited[next] = visited[tmp] + 1;
                    q.add( next );
                }


            }

        }

    }
}
