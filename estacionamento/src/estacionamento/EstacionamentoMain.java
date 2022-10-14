package estacionamento;

import java.util.Scanner;

public class EstacionamentoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lerTeclado = new Scanner(System.in);

		Estacionamento estacionamento = new Estacionamento(01, "Primeiro Estacionamento", "Pe");

		estacionamento.ativar();

		System.out.println("");
		System.out.println("Código: " + estacionamento.getCodigo());
		System.out.println("Nome: " + estacionamento.getNome());
		System.out.println("Cidade: " + estacionamento.getCidade());
		System.out.println("Situação: " + estacionamento.getSituacao());
		System.out.println("Franquia Inicial: " + estacionamento.getValorFranquiaInicial());
		System.out.println("Horas Minimas: " + estacionamento.getHorasFranquiaInicial());
		System.out.println("Valor da hora adicional: " + estacionamento.getValorAdicionalHora());

		System.out.println("Quantas Horas o carro ficou no estacionamento?");
		double valorFinal = estacionamento.calcularEstacionamento(lerTeclado.nextDouble());
		System.out.println(valorFinal);

		estacionamento.desativar();
		
		if (estacionamento.getSituacao().equalsIgnoreCase("Desativado")) {
			System.out.println("Estacionamento desativado, impossivel realizar calculo de valor!");


			
		};

	}
}
