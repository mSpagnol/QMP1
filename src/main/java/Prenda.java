public class Prenda {
    public TipoDePrenda tipo;
    public material material;
    public trama trama;
    public Color colorPrincipal;
    public Color colorSecundario;
    private Formalidad formalidad;

    public Prenda(TipoDePrenda unTipo, material unMaterial, trama unaTrama, Color colorPrincipal, Color colorSecundario, Formalidad formalidad) {
       this.tipo = unTipo;
       this.material = unMaterial;
       this.colorPrincipal = colorPrincipal;
       this.colorSecundario = colorSecundario;
       this.trama = unaTrama;
       this.formalidad = formalidad;
    }

    public categorias categoria() {
        return this.tipo.categoria();
    }

    public boolean isInformal(){
      return formalidad != Formalidad.FORMAL;
    }

    public boolean isSuperior(){
      return this.categoria() == categorias.parteSuperior;
    }

    public boolean isInferior(){
      return this.categoria() == categorias.parteInferior;
    }

    public boolean isCalzado(){
      return this.categoria() == categorias.calzado;
    }


}

