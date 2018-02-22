import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double tamanhoArquivo;
		double velocidadeInternet;
		double tempo;
		
		
		System.out.println("Digite o tamanho do Arquivo(MB): ");
		tamanhoArquivo = ler.nextDouble();
		System.out.println("Digite a velocidade da internet(Mbps):");
		velocidadeInternet = ler.nextDouble();
		tempo = tamanhoArquivo/velocidadeInternet;
		System.out.printf("Seu download demorará aproximadamanete %.2f",tempo);
	}

}
