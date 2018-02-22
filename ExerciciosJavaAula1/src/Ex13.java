import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double salarioPorHora;
		int horasTrabalhadas;
		double salario;
		double INSS;
		double sindicato;
		double salarioLiquido;
		
		System.out.print("Digite o valor recebido por hora: ");
		salarioPorHora = ler.nextDouble();
		System.out.print("Digite as horas trabalhadas: ");
		horasTrabalhadas = ler.nextInt();
		salario = salarioPorHora * horasTrabalhadas;
		
		sindicato = (salario * 5)/100;
		INSS = (salario * 8)/100;
		
		salarioLiquido = salario - (INSS + sindicato);
		
		System.out.println("\nSegue seu historico_________");
		System.out.printf("Salario Bruto: RS%.2f", salario);
		System.out.printf("\nINSS: RS%.2f", INSS);
		System.out.printf("\nSindicato: RS%.2f", sindicato);
		System.out.printf("\nSalario Liquidoo: RS%.2f", salarioLiquido);
		
		
		
	}

}
