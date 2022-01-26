package com.br.lead.filmesLead.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.br.lead.filmesLead.modelo.Categoria;
import com.br.lead.filmesLead.repository.CategoriaRepository;

public class AtualizacaoCategoriaForm {
	@NotNull @NotEmpty @Length(min = 1)
	private String nome;

	public String getNome() {
		return nome;
	}
	
	public Categoria atualizar(Long id,  CategoriaRepository categoriaRepository) {
		Categoria categoria = categoriaRepository.getOne(id);
		
		categoria.setNome(this.nome);
		
		return categoria;
	}
}