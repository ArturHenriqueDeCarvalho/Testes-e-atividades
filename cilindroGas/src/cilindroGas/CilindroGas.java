package cilindroGas;

public class CilindroGas {
	int idCilindro;
	String localizacao;
	double capacidadeMaxima;
	double capacidadeAtual;
	double custoKg;
	double custoAbastecimento;
	String statusAbastecimento;

	public CilindroGas(int idCilindro, String localizacao, double capacidadeMaxima, double custoKg) {
		super();
		this.idCilindro = idCilindro;
		this.localizacao = localizacao;
		this.capacidadeMaxima = capacidadeMaxima;
		this.custoKg = custoKg;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public double getCustoKg() {
		return custoKg;
	}

	public void setCustoKg(double custoKg) {
		this.custoKg = custoKg;
	}

	public int getIdCilindro() {
		return idCilindro;
	}

	public double getCapacidadeMaxima() {
		return capacidadeMaxima;
	}

	public double getCapacidadeAtual() {
		return capacidadeAtual;
	}

	public double getCustoAbastecimento() {
		return custoAbastecimento;
	}

	public String getStatusAbastecimento() {
		if ((this.capacidadeAtual / this.capacidadeMaxima) * 100 > 90) {
			this.statusAbastecimento = "Cheio";
		} else if ((this.capacidadeAtual / this.capacidadeMaxima) * 100 <= 90
				&& (this.capacidadeAtual / this.capacidadeMaxima) * 100 >= 70) {
			this.statusAbastecimento = "Alto";
		} else if ((this.capacidadeAtual / this.capacidadeMaxima) * 100 <= 70
				&& (this.capacidadeAtual / this.capacidadeMaxima) * 100 >= 30) {
			this.statusAbastecimento = "Médio";
		} else if ((this.capacidadeAtual / this.capacidadeMaxima) * 100 <= 30) {
			this.statusAbastecimento = "Baixo";
		}
		return statusAbastecimento;
	}

	public void abastecerCilindro() {
		this.custoAbastecimento = (this.capacidadeMaxima - this.capacidadeAtual) * (this.custoAbastecimento - 0.05);
		this.statusAbastecimento = "Cheio";
	};

	public boolean registrarConsumo(double quantidadeKg) {
		
		
		if (quantidadeKg - this.capacidadeAtual > this.capacidadeAtual) {

			return false;
		} else {
			this.capacidadeAtual = this.capacidadeAtual - quantidadeKg;
			
		}
		return true;

	}

	public void esvaziarCilindro() {
		System.out.println("Cilindro esvaziado por completo");
		this.capacidadeAtual = 0;
		this.statusAbastecimento = "Vazio";

	}

	public void mostrarDados() {
		System.out.println("Id do cilindro: " + this.idCilindro);
		System.out.println("Localização: " + this.localizacao);
		System.out.println("Capacidade Maxima: " + this.capacidadeMaxima);
		System.out.println("Capacidade Atual: " + this.capacidadeAtual);
		System.out.println("Custo por KG: " + this.custoKg);
		System.out.println("Custo do abastecimento: " + this.custoAbastecimento);
		System.out.println("Status: " + getStatusAbastecimento());
		System.out.println("\n");
	}
}
