import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;



public class PrendaTest {
    public Categoria parteSuperior = new Categoria("parte superior");
    public Categoria parteInferior = new Categoria("parte inferior");
    public TipoDePrenda remera = new TipoDePrenda("remera", parteSuperior);

    @Test
    public void deberiaCrearPrenda() throws Exception {
        Prenda camisetaRacing = new Prenda(remera, parteSuperior, "algodon", "celeste","blanco");
        Assert.assertNotNull(camisetaRacing);
    }

    @Test
    public void deberiaArrojarError() throws Exception {
        //Funciona -> Ver como hacer para que acierte en el mensaje de la excepción.
        Prenda camisetaBulls = new Prenda(remera, parteInferior, "algodon", "roja", "blanca");
        String expectedMessage = "El tipo del producto y la categoria no coinciden.";
        Assert.assertNull(camisetaBulls);
    }
}
