package br.com.ronald.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import br.com.ronald.loja.modelo.Produto;

public class TestJava {
	
	@Test
	void teste() {
		Produto produto = new Produto();
		produto.setDescricao("Legal");
		produto.setPreco(new BigDecimal("800"));
		
		assertEquals(new BigDecimal("800"), produto.getPreco());
	}
}
