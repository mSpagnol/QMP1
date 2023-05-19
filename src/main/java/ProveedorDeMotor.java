public class ProveedorDeMotor {
  private static ProveedorDeMotor INSTANCE;
  private static MotorSugerencias motor;

  static ProveedorDeMotor getInstance() {
    return ProveedorDeMotor.INSTANCE;
  }
  static MotorSugerencias getMotor() {
    return motor;
  }

  public void setMotor(MotorSugerencias motor) {
    ProveedorDeMotor.motor = motor;
  }

}
