public class Prenda {
    public TipoDePrenda tipo;
    public material material;
    public Color colorPrincipal;
    public Color colorSecundario;
    public Prenda(TipoDePrenda tipo, material material, Color colorPrincipal, Color colorSecundario) {
        //Caso de que no sea la categoría adecuada tiro la excepción
        if((tipo == null || material == null || colorPrincipal == null))
            throw new RuntimeException("Todos los campos, salvo el color secundario, son obligatorios");
       //Constructor
       this.tipo = tipo;
       this.material = material;
       this.colorPrincipal = colorPrincipal;
       this.colorSecundario = colorSecundario;

    }
}

