import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.print("Digite o primeiro n�mero: ");
		a = ler.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		b = ler.nextInt();
		System.out.println("A soma dos n�meros � de : " + (a+b));
		
	}

}
