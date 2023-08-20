package algorithm.study.dohyun.boj;
import java.util.*;
import java.io.*;
public class Boj_1920 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i =0;i< n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
         // arr = 1 2 3 4 5

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<m; i++){
            int tmp = Integer.parseInt(st.nextToken());
            System.out.println(binary(arr,0, arr.length-1, tmp));
        }

    }
    public static int binary(int[] arr ,int first, int last, int num){ // 탐색할 array = arr , 찾고자 하는 값 = num

        if(first>last)
            return 0;


        int mid = (first + last )/2;

        if( arr[mid] > num )
            return binary(arr, first, mid-1 , num);
        else if( arr[mid] < num )
            return binary(arr,mid+1, last, num);
        else
            return 1;

    }
}
