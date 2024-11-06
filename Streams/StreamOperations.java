import java.util.Arrays;
import java.util.List;

public class StreamOperations {
record Employee (Integer id, String name, Double salary){}

  private static Employee[] arrayOfEmployees = {
    new Employee(1, "Foo", 100000.0),
        new Employee(1, "Bar", 100000.0)
  };
  private static List<Employee> empList = Arrays.asList(arrayOfEmployees);

  public static void main(String[] args){
    StreamOperations.empList.stream().forEach(e -> System.out.println(e));
  }
}
