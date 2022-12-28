
public class Ex03 {

	public static void main(String[] args) {
		//*십진수, *2진수, 8진수, *16진수 
		int Decimal = 10; //  10진수 값의 저장
 		int Binary = 0b1010; /*2진수 값을 표현할때 0b, 
 		0B를 사용하면 자바에서는 2진수 값을 출력*/
 		
 		int Octal = 012; //8진수 접두어 숫자가 0을 사용해서 8진수를 표현
		
 		//16진수 0-9 10=a , 11 12 13 .... 15 = f
 		
 		int HexaDecamal = 0xa; // 0x를 사용하면 16진수표현가능
 		
		System.out.println("Deciaml : " + Decimal);
		System.out.println("Bianry : " + Binary);
		System.out.println("Octal : " + Octal);
		System.out.println("HexaDecamal : " + HexaDecamal);
	}

}
