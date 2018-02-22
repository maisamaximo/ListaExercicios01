import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double lado;
		double area;
		
		System.out.print("Digite o tamanho do lado do quadrado: ");
		lado = ler.nextDouble();
		area = lado*lado;
		System.out.println("A área do quadrado é de: " + area);
		System.out.println("O dobro da área do quadrado é de: " + area*2);

	}

}
