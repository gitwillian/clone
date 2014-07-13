package com.junit_cucumber.pages;

import org.openqa.selenium.By;

public class PaginaResultadoPesquisa extends Pagina{
	
	public String verResultadoPesquisa () {
		String filmeAtual = driver.findElement(By.className("nome-produto"))
				.getText();
		return filmeAtual;
	}

	public String obterPrimeiroFilmeDoResultadoDeBusca() {
		String filme = driver.findElement(By.xpath("//*[@id=\"listagemProdutos\"]/ul/li/ul/li[1]/div/div[2]/a")).getText();
		return filme;
	}

	public String obterSegundoFilmeDoResultadoDeBusca() {
		String filme = driver.findElement(By.xpath("//*[@id=\"listagemProdutos\"]/ul/li/ul/li[2]/div/div[2]/a")).getText();
	
		return filme;
	}

	public String mensagemProdutoIndisponivel() {
		String mensagem = driver.findElement(By.xpath("")).getText();
		return mensagem;
	}

	public String mensagemProdutoInexistente() {
		String mensagem = driver.findElement(By.id("produto inexistente")).getText();
		return mensagem;
	}
        
        public String todosOsSitesPossuemOTermo(String termo) {
		String mensagem = driver.findElement(By.id("produto inexistente")).getText();
		return mensagem;
	}

}
