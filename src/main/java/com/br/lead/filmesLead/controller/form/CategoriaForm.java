package com.br.lead.filmesLead.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.br.lead.filmesLead.modelo.Categoria;

public class CategoriaForm {
	@NotNull @NotEmpty @Length(min = 1)
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Categoria cadastro() {
		return new Categoria(nome);
	}
}