package br.com.ronald.loja.dao;

import javax.persistence.EntityManager;

import br.com.ronald.loja.modelo.Categoria;

public class CategoriaDao {
	private EntityManager em;
	
	public CategoriaDao(EntityManager em) {
		this.em = em;
	}
	
	public void cadastrar(Categoria p) {
		this.em.persist(p);
	}
}
