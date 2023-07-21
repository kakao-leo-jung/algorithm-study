package algorithm.study.dohyun.boj;
import java.util.*;
import java.io.*;
public class Boj_1260 {
    static int n;
    static int m;
    static int v;
    static LinkedList<Integer>[] list;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

        list = new LinkedList[n+1];


        for(int i=1; i<=n; i++){
            list[i] = new LinkedList<Integer>();
        }

        for(int i=0;i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list[a].add(b);
            list[b].add(a);

        }
        for(int i=1;i<=n;i++){
            Collections.sort(list[i]);
        }

        visited = new boolean[n+1];
        dfs(v);
        System.out.println();

        visited = new boolean[n+1];
        bfs(v);
        System.out.println();
    }
    static void dfs(int v){
        if(visited[v])  return;
        visited[v] = true;
        System.out.print(v+" ");
        Iterator<Integer> iter = list[v].listIterator();
        while(iter.hasNext()){
            v = iter.next();
            if(!visited[v]){
                dfs(v);
            }
        }
    }

    public static void bfs(int v){

        Queue<Integer> q = new LinkedList<Integer>();
        q.add(v);
        visited[v] =true;

        while(!q.isEmpty()){
            v = q.poll();
            System.out.print(v+" ");

            Iterator<Integer> iter = list[v].listIterator();
            while(iter.hasNext()){
                int tmp = iter.next();
                if(!visited[tmp]){
                    q.add(tmp);
                    visited[tmp] = true;
                }
            }

        }


    }
}
