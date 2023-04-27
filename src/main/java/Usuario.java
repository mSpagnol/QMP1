import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Usuario {
    public List<Prenda> guardarropa = new ArrayList<>();

    public void agregarPrendaAGuardarropa(Prenda unaPrenda){
        guardarropa.add(unaPrenda);
    }

   /* Como usuario QueMePongo, quiero poder recibir sugerencias de uniformes armados.
    Como usuario QueMePongo, quiero que un uniforme siempre conste de una prenda superior, una inferior y un calzado */
    public Uniforme conformarUniforme(){
        List <Prenda> calzados = filtrarPorCategoria(categorias.calzado);
        List <Prenda> prendaSuperiores = filtrarPorCategoria(categorias.parteSuperior);
        List <Prenda> prendasInferiores = filtrarPorCategoria(categorias.parteInferior);

        Prenda unCalzado = calzados.get(ramdomIntDeUnaLista(calzados));
        Prenda unaPrendaSup = prendaSuperiores.get(ramdomIntDeUnaLista(prendaSuperiores));
        Prenda unaPrendaInf = prendasInferiores.get(ramdomIntDeUnaLista(prendasInferiores));

        return new Uniforme(unaPrendaSup, unaPrendaInf, unCalzado);
    }

    public List<Prenda> filtrarPorCategoria(categorias unaCategoria){
        return guardarropa.stream().filter(prenda -> prenda.tipo.categoria() == unaCategoria).toList();
    }

    public int ramdomIntDeUnaLista(List<Prenda> unaLista){
        Random rand = new Random();
        return  rand.nextInt(unaLista.size());
    }

    //Falta el de administrador.
}
