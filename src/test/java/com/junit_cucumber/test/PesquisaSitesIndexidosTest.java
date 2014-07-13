/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.junit_cucumber.test;

import com.junit_cucumber.pages.PaginaPesquisa;
import com.junit_cucumber.pages.PaginaResultadoPesquisa;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PesquisaSitesIndexidosTest {
     
    private PaginaPesquisa pagina;
    private PaginaResultadoPesquisa resultado;
 
    @Before
    public void antesDoTeste() {
        pagina = new PaginaPesquisa();
    }
     
    @After
    public void depoisDoTeste() {
        pagina.fechar();
    }
 
    @Test
    public void PesquisarUmTermoQueEstejaPresenteEmSitesIndexados() {
        String termoPesquisado = "Cucumber";
        pagina.preencherPesquisa(termoPesquisado);
        resultado = pagina.clicarPesquisar();
//        assertTrue(resultado.todosOsSitesPossuemOTermo(termoPesquisado));
    }
 
    @Test
    public void PesquisarPorUmTermoQueNãoEstejaPresenteEmNenhumSiteIndexado() {
        String termoPesquisado = "Cucumber";
        pagina.preencherPesquisa(termoPesquisado);
        resultado = pagina.clicarPesquisar();
//        assertTrue(resultado.todosOsSitesPossuemOTermo(termoPesquisado));
    }
}
