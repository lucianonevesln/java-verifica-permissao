package br.com.qwa.teste.domain;

public class Cliente {

	private String nome;
	
	private String cpfCnpj;
	
	private Risco risco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public Risco getRisco() {
		return risco;
	}

	public void setRisco(Risco risco) {
		this.risco = risco;
	}
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpfCnpj=" + cpfCnpj + ", risco=" + risco + "]";
	}
	
}
