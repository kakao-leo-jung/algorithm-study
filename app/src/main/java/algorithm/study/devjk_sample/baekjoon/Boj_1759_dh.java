package algorithm.study.devjk_sample.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_1759_dh {

  static int l,c;
  static char[] alpha;
  static boolean[] visited;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    // l개의 알파벳으로 구성되고 최소 1개의 모음 최소 2개의 자음으로 구성-> 알파벳 순서대로여함 abcd:O, badc:X
    l = Integer.parseInt(st.nextToken());
    c = Integer.parseInt(st.nextToken());

    alpha = new char[c];
    visited = new boolean[c];
    st = new StringTokenizer(br.readLine());

    for(int i =0 ;i < c; i++){
      alpha[i] = st.nextToken().charAt(0) ;
    }
    Arrays.sort(alpha);
    password(0,0);
    // cnt = 만든 문자열 수
  }
  public static void password(int cnt,int start){
    if(cnt == l)  { //탈출조건
      String str = "";
      int a = 0;
      int b = 0;

      for(int i=0; i<c; i++){ //한글자씩 검사하기
        if( visited[i] ){
          str = str + alpha[i];
          if(alpha[i] =='a' || alpha[i] =='e' || alpha[i] =='i' || alpha[i] =='o' || alpha[i] =='u' )
            a++;
          else    b++;
        }

      }
      if(a>=1 && b>=2)
        System.out.println(str);

    }
    for(int i= start; i<c;i++){
      visited[i] = true;
      password(cnt+1,i+1);
      visited[i] = false;
    }
  }
}
