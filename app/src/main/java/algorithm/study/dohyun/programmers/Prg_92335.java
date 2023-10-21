package algorithm.study.dohyun.programmers;
import java.util.*;
import java.io.*;
public class Prg_92335 {
    public static void main(String[] args){

        Prg_92335 sol = new Prg_92335();

        int n1 = 437674;
        int k =3;

        int result = sol.solution(n1,k);
        System.out.println(result);

        int n2 = 110011;
        int k2 = 10;
        int result2 = sol.solution(n2,k2);
        System.out.println(result2);

    }
    public int solution(int n, int k) {
        int ans = 0;
        StringBuilder sb = new StringBuilder();
        while( n != 0 ){
            sb.append(n%k);
            n = n / k;
        }
        String num = sb.reverse().toString();

        String[] numarr = num.split("0");
        for( int i=0; i< numarr.length; i++){
            if( numarr[i].equals("1") || numarr[i].equals("") )  continue;
            long prime = Long.parseLong( numarr[i] ) ;
            if(isPrime(prime))
                ans++;
        }
        return ans;
    }

    public boolean isPrime(long num){

        for(long i = 2; i<= Math.sqrt(num) ; i++){
            if(num == 2 || num == 3)    return true;

            if( num % i == 0 )
                return false;
        }
        return true;
    }
}

