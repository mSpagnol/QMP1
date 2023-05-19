import com.google.common.collect.Lists;

import java.util.List;

public class MotorSugerencias {


  List<Prenda> getPrendasValidas(Usuario usuario) {
    return usuario.getGuardarropa();
  }

  List<Sugerencia> generarSugerencias(Usuario usuario) {
    return combinaciones(usuario).stream().map(combinacion -> new Sugerencia(combinacion.get(0), combinacion.get(1), combinacion.get(2))).toList();
  }

  public List<List<Prenda>> combinaciones(Usuario usuario) {
    return Lists.cartesianProduct(this.prendasSuperiores(usuario), this.prendasInferiores(usuario), this.calzados(usuario));
  }

  List<Prenda> prendasSuperiores(Usuario usuario){
    return this.getPrendasValidas(usuario).stream().filter(Prenda::isSuperior).toList();
  }

  List<Prenda> prendasInferiores(Usuario usuario){
    return this.getPrendasValidas(usuario).stream().filter(Prenda::isInferior).toList();
  }

  List<Prenda> calzados(Usuario usuario){
    return this.getPrendasValidas(usuario).stream().filter(Prenda::isCalzado).toList();
  }

}


