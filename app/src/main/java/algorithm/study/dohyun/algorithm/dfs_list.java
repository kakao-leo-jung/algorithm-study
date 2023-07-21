package algorithm.study.dohyun.algorithm;
import java.util.*;

public class dfs_list {
    static int n;
    static int m;
    static int f;
    static boolean[] visited;
    static LinkedList<Integer>[] dl;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        f = sc.nextInt();
        visited = new boolean[n+1];
        dl = new LinkedList[n+1];
        for(int i=0;i<=n;i++)
            dl[i] = new LinkedList<Integer>();

        for(int i=0; i<m ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            dl[a].add(b);
            dl[b].add(a);
        }
        for(int i=1; i<=n;i++){
            Collections.sort(dl[i]);
        }
        dfslist(f);
    }
    public static void dfslist(int f){
        visited[f] = true;
        System.out.print(f+ " ");

        Iterator<Integer> iter = dl[f].listIterator();
        while(iter.hasNext()){

            f = iter.next();
            if( !visited[f] )   dfslist(f);

        }
    }
}
