package apertadinho;
import java.util.Random;
import java.util.Scanner;
public class apertadinho{
	private int inicio;
	private int fim;
	private int numeroSecreto;
	
	Random random = new Random();
	
	public apertadinho(int inicio, int fim) {
		this.inicio = inicio;
		this.fim = fim;
		numeroSecreto = random.nextInt(inicio, fim);
	}
	
	public int getInicio() {
		return this.inicio;
		
	}
	
	public int getFim() {
		return this.fim;
	}
	
	public int getNumeroSecreto() {
		return this.numeroSecreto;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		apertadinho apertadinho = new apertadinho(1,1000);
		
		int chute = 0;
		int real = apertadinho.getNumeroSecreto();
		int first = apertadinho.getInicio();
		int last = apertadinho.getFim();
		
		while(chute != real) {
			System.out.println("Intervalo entre "+first+" e "+last);
			System.out.println("Digite seu número");
			chute = scanner.nextInt();
			if(chute > last || chute < first) {
				System.out.println("Número fora do intervalo");
				continue;
			}
			
			if(chute == real) {
				System.out.println("Parabéns");
				return;
			} else {
				System.out.println("errou");
				if(chute< real) {
					first = chute;
				} else if(chute> real) {
					last = chute;
				} 
				
			}
				
		}
	}
}
