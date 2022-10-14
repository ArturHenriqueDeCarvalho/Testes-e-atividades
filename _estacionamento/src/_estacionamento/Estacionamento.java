package _estacionamento;

public class Estacionamento {

	int codigo;
	String nome;
	int quantidadeVagas;
	String situacao;
	int horasFranquiaInicial;
	double valorFranquiaInicial;
	double valorAdicionalHora;

	public Estacionamento(int codigo, String nome, int quantidadeVagas, String situacao, int horasFranquiaInicial,
			double valorFranquiaInicial, double valorAdicionalHora) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.quantidadeVagas = 80;
		this.situacao = "Desativado";
		this.horasFranquiaInicial = 4;
		this.valorFranquiaInicial = 10;
		this.valorAdicionalHora = 3;
	}

	public void ativar() {
		this.situacao = "Ativado";
		this.quantidadeVagas-=1;
	}

	public void desativar() {
		this.situacao = "Desativado";

	}

	public double calcularEstacionamento(double horasEstacionada) {

		if (this.situacao.equalsIgnoreCase("Ativado")) {
			double valor = (horasEstacionada - this.horasFranquiaInicial) * 3 + 10;
			return valor;
		}else {System.out.println("Estacionamento inativo");}

		return horasEstacionada;
	}
	public String mostrarEstacionamento() {
		System.out.println(
				"Código: "+this.codigo+"\n"+
				"Nome: "+this.nome+"\n"+
				"Situacao: "+this.situacao+"\n"+
				"Quantidade de vagas: "+this.quantidadeVagas+"\n"+
				"Horas Iniciais: "+this.horasFranquiaInicial+"\n"+
				"Valor da franquia Inicial: "+this.valorFranquiaInicial+"\n"+
				"Valor da hora adicional: "+this.valorAdicionalHora);
		return nome;
		
	}
};