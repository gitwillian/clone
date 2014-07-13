/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package acceptanceTest.Test;



import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(
    //this code will only look into "features/" folder for features
    features = {"features/"},
    glue = { "acceptanceTest.Steps"},
    format = {"json:cucumber.json"},
    tags = { "@test" }
    )
public class RunTest{
    
//    private SearchProduct product;
//    
//    @Before
//    public void antesDoTeste() {
//        product = new SearchProduct();
//    }
//    
//    @After
//    public void depoisDoTeste() {
////        product.fechar();
//    }
//    
//    @Test
//    public void test() {
//        String termoPesquisado = "Cucumber";
////        product.preencherPesquisa(termoPesquisado);
//        
////        assertTrue(resultado.todosOsSitesPossuemOTermo(termoPesquisado));
//    }
}
