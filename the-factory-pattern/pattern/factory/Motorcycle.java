package pattern.factory;

public class Motorcycle implements MotorVehicle {
  
  @Override
  public void build(){
    System.out.println("Build Motorcycle");
  }
}
