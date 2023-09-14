package algorithm.study.dohyun.boj;
import java.util.*;
import java.io.*;
public class Boj_11724 {
    static int n,m;
    static int[][] arr;
    static LinkedList<Integer>[] list;
    static boolean[] visited;
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); // 정점의 개수 n
        m = Integer.parseInt(st.nextToken()); // 간선의 개수 m

        list = new LinkedList[n+1];
        for(int i =0; i<= n ; i++)
            list[i] = new LinkedList<Integer>();
        visited = new boolean[n+1];

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list[a].add(b);
            list[b].add(a);
        }


        int ans = 0;
        for(int i  =1; i<=n; i++){
            if( !visited[i] ){
                dfs(i);
                ans++;
            }

        }
        System.out.println(ans);
    }
    public static void dfs(int a){
        visited[a] = true;

        Iterator<Integer> iter = list[a].listIterator();

        while(iter.hasNext()){
            a = iter.next();
            if( !visited[a] )
                dfs(a);
        }


    }
}
