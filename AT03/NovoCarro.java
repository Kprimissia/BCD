package prjcarro;

import java.util.Scanner;

public class NovoCarro {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		Carro carro01 = new Carro();
		Carro carro02 = new Carro("VW", "GOL", 0);
		
		System.out.println("Qual é a marca?");
		carro01.setMarca (Sc.nextLine());

		System.out.println("Qual o modelo? ");
		carro01.setModelo (Sc.nextLine());
		
		System.out.println("Qual a velocidade? ");
		carro01.setVelocidade (Sc.nextInt());
		
		System.out.println(" Opções: ");
		System.out.println("|  1  | Acelerar ");
		System.out.println("|  2  | Frear ");
		System.out.println("|  3  | buzinar");
		System.out.println(" Escolha a sua opção! ");
		int escolha =Sc.nextInt();
		
		if (escolha == 1) {
			System.out.println("Quanto você quer acelerar?");
			carro01.acelerar(Sc.nextInt());
		}
		
		else if (escolha == 2) {
			System.out.println("Quanto você quer desacelerar?");
			carro01.frear(Sc.nextInt());
		} 
		
		else if (escolha == 3) {
			carro01.buzinar();
		}
		else {
			System.out.println("Opção inválida!");
		}
		
		System.out.println("Marca: "+ carro01.getMarca());
		System.out.println("Modelo: "+ carro01.getModelo());
		System.out.println("Velocidade: "+ carro01.getVelocidade());
			
	}

}
