import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int F;
		int C;
		
		System.out.print("Digite o valor da temperatura em FARENHEIT: ");
		F = ler.nextInt();
		C = (5*(F-32)/9);
		System.out.println("O valor convertido em Celcius é de: " + C + "º");
	}

}
