package br.com.fiap.bean;

import java.util.Calendar;

import br.com.fiap.annotations.Coluna;
import br.com.fiap.annotations.Table;

@Table(name="TAB_FUNCIONARIOS")
public class Funcionario {

	@Coluna(nome="NM_FUNCIONARIO")
	private String nome;
	
	@Coluna(nome="DT_ADMISSAO")
	private Calendar dataAdmissao;
		
	@Coluna(nome="VL_SALARIO")
	private double salario;

	@Coluna(nome="TESTE")
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Calendar dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
