import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AtuendoTest {
    private final Categoria parteSuperior = new Categoria("parte superior");
    private final Categoria parteInferior = new Categoria("parte inferior");
    private final TipoDePrenda remera = new TipoDePrenda("remera", parteSuperior);
    private final Atuendo nuevoAtuendo = new Atuendo();

    Prenda camisetaRacing;
    Prenda camisetaBulls;

    @Before
    public void init() throws Exception {
        camisetaRacing = new Prenda(remera, parteSuperior, "algodon", "celeste","blanco");
        camisetaBulls = new Prenda(remera, parteSuperior, "algodón", "roja", "blanca");
    }

    @Test
    public void noDeberiaAgregarLaSegundaPrenda() throws Exception {
        nuevoAtuendo.agregarPrenda(camisetaRacing);
        nuevoAtuendo.agregarPrenda(camisetaBulls);

        List <Prenda> listaDePrendasEsperada = new ArrayList<>();
        listaDePrendasEsperada.add(camisetaRacing);

        Assert.assertEquals(nuevoAtuendo.prendas, listaDePrendasEsperada);
    }

}
