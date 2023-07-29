package algorithm.study.devjk_sample.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_1922_dh {

  static int[] parent;
  static int[][] graph;

  public static void main(String[] args) throws IOException {


    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    StringTokenizer st = new StringTokenizer(br.readLine());

//    int n = Integer.parseInt(st.nextToken()); // 정점의 개수
//    int m = Integer.parseInt(st.nextToken()); // 간선의 개수
    int n = Integer.parseInt(br.readLine());
    int m = Integer.parseInt(br.readLine());


    parent = new int[n+1]; // parent값이 동일하면 에지 추가 안함.(중복
    for(int i=0;i<n+1;i++)
      parent[i] = i;


    graph = new int[m][3]; // 간선
    for(int i=0; i<m; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      graph[i][0] = Integer.parseInt(st.nextToken()); // (u,v) 에서 u
      graph[i][1] = Integer.parseInt(st.nextToken()); // (u,v) 에서 v
      graph[i][2] = Integer.parseInt(st.nextToken()); // 에지의 가중치
    }
    //에지의 가중치 오름차순으로 정렬
    Arrays.sort(graph, (o1,o2) -> o1[2]-o2[2] );
    kruscal();
  }

  public static int findset(int x){
    // 루트 찾는 함수
    if(parent[x] != x)
      parent[x] = findset(parent[x]);

    return parent[x];
  }

  public static void union(int u,int v){
    int x = findset(u);
    int y = findset(v);

    if(x>y)
      parent[y] = x;
    else
      parent[x] = y;

  }
  public static void kruscal(){
    int result=0;
    int edgenum =0;
    for(int i=0; i< graph.length;i++){
      if( findset(graph[i][0]) != findset(graph[i][1]) ){
        result += graph[i][2];
        union(graph[i][0], graph[i][1]);
        edgenum ++;
      }
//      if( edgenum == graph.length -1)
//        break;
    }
    System.out.println(result);

  }
}
