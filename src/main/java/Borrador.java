public class Borrador {
    public TipoDePrenda tipo;
    public material material;
    public trama unaTrama = trama.lisa;
    public Color colorPrincipal;
    public Color colorSecundario;

    public Prenda crearPrenda(){
        return new Prenda(tipo, material, unaTrama, colorPrincipal, colorSecundario);
    }
    public void especificarTipo(TipoDePrenda tipo){
        verificarQueNoSeaNulo(tipo);
        this.tipo = tipo;
    }

    public void especificarMaterial(material material){
        verificarQueNoSeaNulo(material);
        this.material = material;
    }

    public void especificarTrama(trama otraTrama){
        if(otraTrama == null)
            this.unaTrama = trama.lisa;
        else
            this.unaTrama = otraTrama;
    }

    public void especificarColorPrincipal(Color unColor){
        verificarQueNoSeaNulo(unColor);
        this.colorPrincipal = unColor;
    }

    public void especificarColorSecundario(Color unColor){
        this.colorSecundario = unColor;
    }

    public void verificarQueNoSeaNulo(Object unObjeto){
        if(unObjeto == null)
            throw new RuntimeException("El campo no puede ser nulo");
    }
}
