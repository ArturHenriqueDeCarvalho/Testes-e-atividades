package cilindroGas;

import java.util.Scanner;

public class CilindroGasMain {

	public static void main(String[] args) {
		Scanner lerTeclado = new Scanner(System.in);

		CilindroGas cilindroGas = new CilindroGas(111, "Recife", 100, 10);

		cilindroGas.capacidadeAtual = cilindroGas.capacidadeMaxima;
		cilindroGas.statusAbastecimento = "Cheio";

		cilindroGas.mostrarDados();

		System.out.println("De quanto foi o primeiro consumo?");
		cilindroGas.registrarConsumo(lerTeclado.nextDouble());
		cilindroGas.mostrarDados();

		if (cilindroGas.capacidadeAtual < 0) {
			System.out.println("Consumo maior que a capacidade atual do cilindro");
			cilindroGas.capacidadeAtual=0;
		} else {
			System.out.println("De quanto foi o segundo consumo?");
			cilindroGas.registrarConsumo(lerTeclado.nextDouble());

			cilindroGas.mostrarDados();
			if (cilindroGas.capacidadeAtual < 0) {
				System.out.println("Consumo maior que a capacidade atual do cilindro");
				cilindroGas.capacidadeAtual=0;
			} else {
				System.out.println("De quanto foi o terceiro consumo?");
				cilindroGas.registrarConsumo(lerTeclado.nextDouble());
				cilindroGas.mostrarDados();
				if (cilindroGas.capacidadeAtual < 0) {
					System.out.println("Consumo maior que a capacidade atual do cilindro");
					cilindroGas.capacidadeAtual=0;
				}
				cilindroGas.mostrarDados();
				cilindroGas.esvaziarCilindro();
				cilindroGas.mostrarDados();


				
			}
		}

	}

}
