import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float valorPorHora;
		int horasTrabalhadasMes;
		float saldoFimMes;
		
		System.out.println("Quanto � o valor que ganhas por hora trabalhada?");
		valorPorHora = ler.nextFloat();
		System.out.println("Quantas horas trabalhou este m�s?");
		horasTrabalhadasMes = ler.nextInt();
		
		saldoFimMes = valorPorHora * horasTrabalhadasMes;
		System.out.println("Seu salario no fim do m�s ser� de: " + saldoFimMes);
		
	}

}
