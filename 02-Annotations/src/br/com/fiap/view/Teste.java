package br.com.fiap.view;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import br.com.fiap.annotations.Coluna;
import br.com.fiap.annotations.Table;
import br.com.fiap.bean.Funcionario;

public class Teste {

	public static void main(String[] args) {
		//Recuperar todos os atributos da classe Funcionario
		Field[] atributos = Funcionario.class.getDeclaredFields();
		for (Field field : atributos) {
			//Imprime o nome do atributo
			System.out.println("Atributo: " + field.getName());
			//Recupera a anotação Coluna do atributo
			Coluna anotacao = field.getAnnotation(Coluna.class);
			//Imprimir o valor "nome" da anotação
			System.out.println("Anotação: " + anotacao.nome());
		}
		
		//Recuperar a anotação definida no método
		Method[] metodos = Funcionario.class.getDeclaredMethods();
		for (Method method : metodos) {
			System.out.println("Métodos :"+ method.getName());
			//Recuperar a anotação
			Coluna anotacao = method.getAnnotation(Coluna.class);
			if (anotacao != null)
				System.out.println("Anotação: " + anotacao.nome());
		}		
		
		//Exercício
		//Recuperar a anotação da classe
		Table anotacao = Funcionario.class.getAnnotation(Table.class);
		System.out.println("SELECT * FROM " + anotacao.name());
		
		
	}
	
}


