import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double raio;
		double pi = 3.14;
		double area;
		
		System.out.print("Digite o valor do raio: ");
		raio = ler.nextDouble();
		area = (raio*raio) * pi;
		// teste = pi * Math.pow(raio, 2);
		System.out.println("O VALOR DA AREA DO CIRCULO É DE: " + area);
		
	}
}
