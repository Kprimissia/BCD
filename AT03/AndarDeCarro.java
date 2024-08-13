package prjcarro;
import java.util.Scanner;

public class AndarDeCarro {

	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		System.out.println(" Qual é a marca do carro? ");
		String marca = Sc.next();
		
		System.out.println(" Qual é o modelo do carro? ");
		String modelo = Sc.next();
		
		System.out.println(" Qual é o modelo do carro? ");
		int velocidade = Sc.nextInt();
		
		
		System.out.println(" Opções: ");
		System.out.println(" 1 | Acelerar ");
		System.out.println(" 2 | Frear ");
		System.out.println(" Escolha a sua opção! ");
		int opcao = Sc.nextInt();
		
		if (opcao == 1) {
			System.out.println(" Quanto você quer acelerar? ");
			int valor = Sc.nextInt();
			velocidade += valor;
		}
	
		else if (opcao == 2) {
			System.out.println(" Quanto você quer desacelerar? ");
			int valor = Sc.nextInt();
			velocidade -= valor;	
			}
			
		else {
			System.out.println("Opção inválida!");
		}	
		System.out.println("Marca: "+ marca);
		System.out.println("Modelo: "+ modelo);
		System.out.println("Velocidade: "+ velocidade);	
	}
}
