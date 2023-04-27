public class Uniforme {
    public Prenda prendaSuperior;
    public Prenda prendaInferior;
    public Prenda prendaCalzado;

    public Uniforme(Prenda unaPrendaSuperior, Prenda unaPrendaInferior, Prenda unCalzado){
        this.prendaSuperior = unaPrendaSuperior;
        this.prendaInferior = unaPrendaSuperior;
        this.prendaCalzado = unCalzado;
    }
}
