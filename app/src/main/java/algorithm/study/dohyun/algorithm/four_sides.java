package algorithm.study.dohyun.algorithm;
import java.util.*;
import java.io.*;
public class four_sides {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 공간의 크기
        String str = br.readLine();
        str = str.replace(" ","");

        int[] start = {1,1};

        for( int i= 0; i<str.length(); i++){
            char next = str.charAt(i);
            switch(next){
                case 'L':
                    start[1] = (  start[1] - 1 < 1 ? start[1]  : start[1] -1 );
                    break;
                case 'R':
                    start[1] = ( N <start[1] + 1 ? start[1]  : start[1]+1 );
                    break;
                case 'U':
                    start[0] = (  start[0] - 1 < 1 ? start[0]  : start[0] -1 );
                    break;
                case 'D':
                    start[0] = (  N < start[0] + 1  ? start[0]  : start[0]+1 );
                    break;
            }
        }
        System.out.println(start[0]+" "+start[1]);
    }
}
