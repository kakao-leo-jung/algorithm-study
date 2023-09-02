package algorithm.study.dohyun.programmers;
import java.util.*;
public class Prg_42577 {
    public static void main(String[] args){
        Prg_42577 sol = new Prg_42577();

        String[] phonebook1 = {"119", "97674223", "1195524421"};
        boolean answer = sol.solution(phonebook1);
        System.out.println(answer);


        String[] phonebook2 = {"123","456","789"};
        boolean answer2 = sol.solution(phonebook2);
        System.out.println(answer2);

    }
    public boolean solution( String[] phone_book ){
        boolean answer = true;
        Arrays.sort(phone_book);
        for( int i = 0; i< phone_book.length -1 ; i++){
            if( phone_book[i+1].startsWith(phone_book[i]) )
                answer = false;
        }
        return answer;
    }
}
