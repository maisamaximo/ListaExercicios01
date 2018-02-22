import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int A;
		int B;
		double C;
		
		System.out.print("Digite o primeiro número inteiro: ");
		A = ler.nextInt();
		System.out.print("Digite o segundo número inteiro: ");
		B = ler.nextInt();
		System.out.print("Digite um número real: ");
		C = ler.nextInt();
		
		double respostaA = (A*2) * (B/2);
		System.out.println("A. O produto do dobro do primeiro com metade do segundo: " + respostaA);
		double respostaB = (A*3) + C;
		System.out.println("B. A soma do triplo do primeiro com o terceiro: " + respostaB);
		double respostaC = Math.pow(C, 3);
		System.out.println("C. O terceiro elevado ao cubo: " + respostaC);
	}
}
