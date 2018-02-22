import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double altura;
		double pesoideal;
		
		System.out.print("Digite sua altura: ");
		altura = ler.nextDouble();
		pesoideal = (72.7 * altura) - 58;
		System.out.print("Seu peso ideal é de  " + pesoideal);
	}
	


}
