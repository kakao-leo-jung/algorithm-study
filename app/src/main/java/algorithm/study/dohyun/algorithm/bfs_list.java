package algorithm.study.dohyun.algorithm;
import java.util.*;
public class bfs_list {
    static boolean[] visited;
    static LinkedList<Integer>[] arrlist;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 노드 수
        int m = sc.nextInt(); // 간선 수
        int s = sc.nextInt(); // 시작 노드

        visited = new boolean[n+1];
        arrlist = new LinkedList[n+1];

        for(int i=0;i<=n;i++){
            arrlist[i] = new LinkedList<Integer>();
        }

        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            arrlist[a].add(b);
            arrlist[b].add(a);
        }
        for(int i=1; i<=n; i++){
            Collections.sort(arrlist[i]);
        }
        bfs_list(s);
    }
    public static void bfs_list(int s){
        Queue<Integer> q = new LinkedList<Integer>();

        q.add(s);
        visited[s] = true;

        while(!q.isEmpty()){
            s = q.poll(); // q의 맨 앞 값 가져오고 삭제함.
            System.out.print(s + " ");
            Iterator<Integer> iter = arrlist[s].listIterator();

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
