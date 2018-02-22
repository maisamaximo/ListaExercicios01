import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		double media;

		System.out.println("Digite sua primeira, segunda, terceira e quarta nota: ");
		nota1 = ler.nextDouble();
		nota2 = ler.nextDouble();
		nota3 = ler.nextDouble();
		nota4= ler.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		System.out.println("A média de suas notas é de " + media);
		
		
	}

}
