package com.junit_cucumber.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PaginaPesquisa extends Pagina {

	public PaginaPesquisa() {
		abrirBrowser();
		driver.get("http://tghcastro.lojaintegrada.com.br/");

	}
	public WebElement obterListaDeFilmes() {
		
		
		WebElement listaDeFilmes = driver.findElement(By
				.className("listagem-linha"));
		return listaDeFilmes;
	}
	public void preencherCaixaDePesquisa(String nomeFilme) {
		WebElement caixaPesquisa = driver.findElement(By.id("auto-complete"));
		caixaPesquisa.sendKeys(nomeFilme);
		
	}
	public PaginaResultadoPesquisa clicarBotaoPesquisa() {
		WebElement botaoPesquisa = driver.findElement(By.xpath("//*[@id=\"form-buscar\"]/button"));
		botaoPesquisa.click();
		return new PaginaResultadoPesquisa();
		

	}
	
	
	
	public List<WebElement> listarTodosFilmesCapa (){
		List<WebElement> ListaDeFilmes = driver.findElements(By
				.xpath("//*[@id=\"listagemProdutos\"]/ul/li/ul/li"));
		return ListaDeFilmes;
	}

    public void fechar() {
        driver.close();
    }

    public void preencherPesquisa(String termoPesquisado) {
        WebElement caixaPesquisa = driver.findElement(By.id("auto-complete"));
		caixaPesquisa.sendKeys(termoPesquisado);
    }

    public PaginaResultadoPesquisa clicarPesquisar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
