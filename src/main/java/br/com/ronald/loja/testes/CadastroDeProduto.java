package br.com.ronald.loja.testes;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import br.com.ronald.loja.dao.CategoriaDao;
import br.com.ronald.loja.dao.ProdutoDao;
import br.com.ronald.loja.modelo.Categoria;
import br.com.ronald.loja.modelo.Produto;
import br.com.ronald.loja.util.JPAUtil;

public class CadastroDeProduto {
	
	public static void main(String[] args) {
		cadastro();
		Long id = 1l;
		
		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDao dao = new ProdutoDao(em);
		
		Produto p = dao.buscarPorId(id);
		System.out.println(p.getNome());
		

	}

	private static void cadastro() {
		Categoria categoria = new Categoria("CELULAR");
		Produto celular = new Produto("Samsung", "Muito Bom", new BigDecimal("800"), categoria);
		
		EntityManager em = JPAUtil.getEntityManager();
		CategoriaDao categoriaDao = new CategoriaDao(em);
		ProdutoDao dao = new ProdutoDao(em);
		
		em.getTransaction().begin();
		categoriaDao.cadastrar(categoria);
		dao.cadastrar(celular);
		em.getTransaction().commit();
		em.close();
	}
}
