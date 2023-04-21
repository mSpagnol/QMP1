import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Atuendo {
    public List<Prenda> prendas = new ArrayList<>();
    public void agregarPrenda(Prenda unaPrenda) throws Exception {
        //Ver la prenda que voy a agregar tenga sentido.
        //No puedo tener 2 calzados o dos partes inferirores => Categorias.
        //No puedo tener 2 remeras => Tipos
        //Un Atuendo puede tener varios accesorios
        //Un Atuendo puede tener remera y campera.
        if(NoValidarPrenda(unaPrenda)) throw new Exception("No tiene sentido agregar está prenda");

        prendas.add(unaPrenda);
    }

    private boolean NoValidarPrenda(Prenda unaPrenda){
        //Retornar false si:
        //Si contiene remera y el tipo prenda es remera.
        //Si contiene calzado y la categoria de la prenda es calzado.
        //Si contiene parteInferior y la categoria prenda es parte inferior.


        return (esDeTipoYContieneTipo("remera", unaPrenda) ||
                esDeCategoriaYContieneCategoria("calzado", unaPrenda) ||
                esDeCategoriaYContieneCategoria("parte inferior", unaPrenda));

    }

    private boolean esDeCategoriaYContieneCategoria(String categoria, Prenda unaPrenda){
        List<Categoria> listaDeCategorias =
                        prendas
                        .stream()
                        .map(prenda -> prenda.categoria)
                        .toList();

        return (listaDeCategorias.stream().anyMatch(categoria1 -> categoria1.categoria.equals(categoria))
                && unaPrenda.categoria.categoria.equals(categoria));
    }

    private boolean esDeTipoYContieneTipo(String algunTipo, Prenda unaPrenda){
        List<TipoDePrenda> listaDeTipos =
                prendas
                .stream()
                .map(prenda -> prenda.tipo)
                .toList();

        return (listaDeTipos.stream().anyMatch(unTipo -> unTipo.tipo.equals(algunTipo))
                && unaPrenda.tipo.tipo.equals(algunTipo));
    }

}
