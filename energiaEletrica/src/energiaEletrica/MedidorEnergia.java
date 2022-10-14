package energiaEletrica;

public class MedidorEnergia {
	int idMedidor;
	String nrSerie;
	char tipoUcInstalado;
	int leituraAnterior;
	int leituraAtual;
	int consumo;
	double valorConta;

	public MedidorEnergia(int idMedidor, String nrSerie, char tipoUcInstalado, int leituraAnterior, int leituraAtual,
			int consumo, double valorConta) {
		super();
		this.idMedidor = idMedidor;
		this.nrSerie = nrSerie;
		this.tipoUcInstalado = tipoUcInstalado;
		this.leituraAnterior = leituraAtual;
		this.leituraAtual = leituraAtual;
		this.consumo = 0;
		this.valorConta = 0;
	}

	void registrarLeitura(int leitura) {
		this.leituraAtual = this.leituraAnterior;
		leitura = this.leituraAtual;

		this.consumo = this.leituraAtual - this.leituraAnterior;
		calcularConta(leitura);
	}

	void calcularConta(int i) {
		if (this.tipoUcInstalado == 'c' || this.tipoUcInstalado == 'C') {
			this.valorConta = this.consumo * 0.7;
		} else if (this.tipoUcInstalado == 'i' || this.tipoUcInstalado == 'I') {
			this.valorConta = this.consumo * 0.5;

		} else if (this.tipoUcInstalado == 'r' || this.tipoUcInstalado == 'R') {
			this.valorConta = this.consumo * 0.6;

		} else {
			System.out.println("Tipo de unidade de consumo incorreta.");
		}
		;
	}

	public char getTipoUcInstalado() {
		return tipoUcInstalado;
	}

	public void setTipoUcInstalado(char tipoUcInstalado) {
		this.tipoUcInstalado = tipoUcInstalado;
	}

	public int getLeituraAtual() {
		return leituraAtual;
	}

	public void setLeituraAtual(int leituraAtual) {
		this.leituraAtual = leituraAtual;
	}

	public void setIdMedidor(int idMedidor) {
		this.idMedidor = idMedidor;
	}

	public void setNrSerie(String nrSerie) {
		this.nrSerie = nrSerie;
	}

	public void setLeituraAnterior(int leituraAnterior) {
		this.leituraAnterior = leituraAnterior;
	}

	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

	public void setValorConta(double valorConta) {
		this.valorConta = valorConta;
	}

}
