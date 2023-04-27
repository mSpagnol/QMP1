public class Prenda {
    public TipoDePrenda tipo;
    public material material;
    public trama trama;
    public Color colorPrincipal;
    public Color colorSecundario;
    public Remera remera;
    public Pantalon pantalon;
    public Prenda(TipoDePrenda unTipo, material unMaterial, trama unaTrama, Color colorPrincipal, Color colorSecundario) {
       this.tipo = unTipo;
       this.material = unMaterial;
       this.colorPrincipal = colorPrincipal;
       this.colorSecundario = colorSecundario;
       this.trama = unaTrama;
    }

    public categorias categoria() {
        return this.tipo.categoria();
    }


}

