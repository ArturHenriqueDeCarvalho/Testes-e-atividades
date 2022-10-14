package energiaEletrica;

import java.util.Scanner;

public class MedidorEnergiaMain {

	public static void main(String[] args) {
		
		  Scanner lerTeclado = new Scanner(System.in);
		 
		MedidorEnergia energiaEletrica = new MedidorEnergia(111, "15Rs6", 'c', 0, 0, 0, 0);

		/*
		 * System.out.println("Favor informar o valor da leitura: ");
		 * this.(lerTeclado.nextInt());
		 */

		System.out.println("Indentificado:" + energiaEletrica.idMedidor + "\n" + "Numero de Série: "
				+ energiaEletrica.nrSerie + "\n" + "Tipo de unidade: " + energiaEletrica.tipoUcInstalado + "\n"
				+ "Leitura Anterior(kWh):" + energiaEletrica.leituraAnterior + "\n" + "Leitura Atual(kWh):"
				+ energiaEletrica.leituraAtual + "\n" + "Consumo do mês(kWh):" + energiaEletrica.consumo + "\n"
				+ "Valor da conta(R$)" + energiaEletrica.valorConta);
		
		

		System.out.println("Indentificado:" + energiaEletrica.idMedidor + "\n" + "Numero de Série: "
				+ energiaEletrica.nrSerie + "\n" + "Tipo de unidade: " + energiaEletrica.tipoUcInstalado + "\n"
				+ "Leitura Anterior(kWh):" + energiaEletrica.leituraAnterior + "\n" + "Leitura Atual(kWh):"
				+ energiaEletrica.leituraAtual + "\n" + "Consumo do mês(kWh):" + energiaEletrica.consumo + "\n"
				+ "Valor da conta(R$)" + energiaEletrica.valorConta);
		
		 System.out.println("Favor informar o valor da leitura atual: \n");
		energiaEletrica.setLeituraAtual(lerTeclado.nextInt());
		energiaEletrica.calcularConta(energiaEletrica.getLeituraAtual());

		
		 System.out.println("Indentificador :" + energiaEletrica.idMedidor + "\n" + "Numero de Série: "
					+ energiaEletrica.nrSerie + "\n" + "Tipo de unidade: " + energiaEletrica.tipoUcInstalado + "\n"
					+ "Leitura Anterior(kWh):" + energiaEletrica.leituraAnterior + "\n" + "Leitura Atual(kWh):"
					+ energiaEletrica.leituraAtual + "\n" + "Consumo do mês(kWh):" + energiaEletrica.consumo + "\n"
					+ "Valor da conta(R$)" + energiaEletrica.valorConta);
			}
}
