import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int F;
		int C;
		
		System.out.print("Digite o valor da temperatura em CELCIUS: ");
		C = ler.nextInt();
		F = ((9 * C) / 5) + 32;
		System.out.println("O valor convertido em Farenheit é de: " + F + "º");
	}
}
