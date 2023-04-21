public class Prenda {
    public TipoDePrenda tipo;
    public Categoria categoria;
    public String material;
    public String colorPrincipal;
    public String colorSecundario;

    public Prenda(TipoDePrenda tipo, Categoria categoria, String material, String colorPrincipal, String colorSecundario) throws Exception {
        //Caso de que no sea la categoría adecuada tiro la excepción
        if(! this.coindiceTipoConCategoria(tipo, categoria)) this.reportarIncoincidenciaDeTipo();

       //Constructor
       this.tipo = tipo;
       this.categoria = categoria;
       this.material = material;
       this.colorPrincipal = colorPrincipal;
       this.colorSecundario = colorSecundario;

    }

    private boolean coindiceTipoConCategoria(TipoDePrenda tipo, Categoria categoria){
        //Verifico que sea la categoría indicada de la prenda.
       return tipo.categoriaCoincidente.equals(categoria);
    }

    private void reportarIncoincidenciaDeTipo() throws Exception {
        throw new Exception("El tipo del producto y la categoria no coinciden.");
    }

}
