import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private List<Prenda> guardarropa = new ArrayList<>();
    private Integer edad;
    ProveedorDeMotor proveedor;

    public Usuario (Integer edad, ProveedorDeMotor proveedor) {
      this.edad = edad;
      this.proveedor = proveedor;
    }

    List<Sugerencia> generarSugerencias () {
      return this.getMotor().generarSugerencias(this);
    }

    public MotorSugerencias getMotor() {
      return proveedor.getMotor();
    }

    public Integer getEdad() {
      return this.edad;
  }

    public List<Prenda> getGuardarropa(){
      return this.guardarropa;
  }
}
