package algorithm.study.dohyun.boj;
import java.util.*;
import java.io.*;
public class Boj_12778 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
        StringTokenizer st ;

        int T = Integer.parseInt(br.readLine());

        for( int i= 0; i< T; i++){
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken()); // 글자수
            String kind = st.nextToken(); // C = 문자를 숫자로
            if( kind.equals("C") ){
                String change = br.readLine();
                change = change.replace(" ","");
                for(int j= 0; j<num ; j++){
                    char ch = change.charAt(j);
                    System.out.print(ch-64+" ");
                }
            }else { // N = 숫자를 문자로
                st = new StringTokenizer(br.readLine());
                for(int j =0 ; j < num ; j++) {

                    int tmp = Integer.parseInt(st.nextToken());
                    System.out.print( (char)(tmp+64) +" ");
                }
            }
            System.out.println();
        }
    }
}
