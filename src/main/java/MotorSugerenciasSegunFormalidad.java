import java.util.List;
public class MotorSugerenciasSegunFormalidad extends MotorSugerencias{
  @Override
  List<Prenda> getPrendasValidas(Usuario usuario) {
    return usuario.getEdad() > 55 ?
        usuario.getGuardarropa().stream().filter(Prenda::isInformal).toList() :
        super.getPrendasValidas(usuario);
  }

}
