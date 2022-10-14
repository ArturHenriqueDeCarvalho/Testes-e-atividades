package estacionamento;

public class Estacionamento {

	private int codigo;
	private String nome;
	private String cidade;
	private int qtdVagas;
	private String situacao;
	private int horasFranquiaInicial;
	private double valorFranquiaInicial;
	private double valorAdicionalHora;

	public Estacionamento(int codigo, String nome, String cidade) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cidade = cidade;
		this.qtdVagas = 80;
		this.situacao = "Desativado";
		this.horasFranquiaInicial = 3;
		this.valorFranquiaInicial = 10;
		this.valorAdicionalHora = 3;
	}

	void ativar() {
		this.situacao = "Ativado";
	};

	void desativar() {
		this.situacao = "Desativado";
	};
	

	double calcularEstacionamento(double horasEstacionadas) {
		if (this.situacao.equalsIgnoreCase("Ativado")) {
			double horasFinais = horasEstacionadas - this.horasFranquiaInicial;
			
			if (horasFinais > 0) {
				double valorFinal = (horasFinais * this.valorAdicionalHora) + this.valorFranquiaInicial;

				return valorFinal;
			}
			return this.valorFranquiaInicial;
		} else {
			return 0;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public double getValorFranquiaInicial() {
		return valorFranquiaInicial;
	}

	public void setValorFranquiaInicial(double valorFranquiaInicial) {
		this.valorFranquiaInicial = valorFranquiaInicial;
	}

	public double getValorAdicionalHora() {
		return valorAdicionalHora;
	}

	public void setValorAdicionalHora(double valorAdicionalHora) {
		this.valorAdicionalHora = valorAdicionalHora;
	}

	public int getCodigo() {
		return codigo;
	}

	public int getQtdVagas() {
		return qtdVagas;
	}

	public int getHorasFranquiaInicial() {
		return horasFranquiaInicial;
	};

}
