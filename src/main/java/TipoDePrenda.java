import java.util.List;

public class TipoDePrenda {
    public String tipo;
    public Categoria categoriaCoincidente;

    public TipoDePrenda (String tipo, Categoria categoriaCoincidente) {
        this.tipo = tipo;
        this.categoriaCoincidente = categoriaCoincidente;
    }
}
