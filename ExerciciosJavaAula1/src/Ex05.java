import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		double metros;
		double centimetros;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o valor em metros: ");
		metros = ler.nextDouble();
		centimetros = metros * 100;
		System.out.println("O valor inserido convertido para centimetros é de: " + centimetros);
	}
}
