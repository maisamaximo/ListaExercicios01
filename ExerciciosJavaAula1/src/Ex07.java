import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double lado;
		double area;
		
		System.out.print("Digite o tamanho do lado do quadrado: ");
		lado = ler.nextDouble();
		area = lado*lado;
		System.out.println("A �rea do quadrado � de: " + area);
		System.out.println("O dobro da �rea do quadrado � de: " + area*2);

	}

}
