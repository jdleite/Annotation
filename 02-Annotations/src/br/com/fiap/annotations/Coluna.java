package br.com.fiap.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
//Define que a anota��o � usada em atributos
@Target({ElementType.FIELD,ElementType.METHOD}) 
public @interface Coluna {

	String nome();
	
}