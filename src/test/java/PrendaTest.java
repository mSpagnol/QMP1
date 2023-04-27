import org.junit.Assert;
import org.junit.Test;

public class PrendaTest {
    public Zapatillas zapatillas = new Zapatillas();
    public Remera remera = new Remera();
    public Pantalon pantalon = new Pantalon();
    public Prenda zapatillasNike;
    public Prenda remeraFutbol;
    public Prenda pantalonRacing;
    public Color rojoClaro = new Color(255,155, 07);
    public Color blanco = new Color(255,255,255);
    public Color celeste = new Color(141,245,240);


    @Test
    public void crearBorradorYCrearPrenda(){
        //Ver si esto capaz se tenía que hacer en init.
        Borrador remeraFútbolBorrador = new Borrador();
        remeraFútbolBorrador.especificarTipo(remera);
        remeraFútbolBorrador.especificarMaterial(material.ALGODON);
        remeraFútbolBorrador.especificarTrama(trama.rayada);
        remeraFútbolBorrador.especificarColorPrincipal(celeste);
        remeraFútbolBorrador.especificarColorSecundario(blanco);
        remeraFutbol = remeraFútbolBorrador.crearPrenda();

        //Assert.assertTrue(remeraFutbol.equals(new Prenda(remera, material.ALGODON, trama.rayada, celeste, blanco)));
    }


}
