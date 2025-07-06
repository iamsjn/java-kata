package kata.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaKata {

public static void main(String[] args) {
    List<String> pets = Arrays.asList("Dog", "Cat");
    
    pets.forEach((x) -> System.out.println(x));
    pets.forEach(System.out::println);

    // Using built in lambdas

    // Predicate
    Predicate<String> filterPets = x -> x.startsWith("D");
    pets.stream().filter(t -> filterPets.test(t)).forEach(System.out::println);

    // Consumers
    Consumer<String> printPet = x -> System.out.println(x);
    pets.forEach(printPet);

    //Function
    Function<String, String> toUpperCase = x -> x.toUpperCase();
    pets.stream().map(x -> toUpperCase.apply(x)).forEach(System.out::println);

    // Suppliers
    Supplier<java.time.LocalTime> timeSupplier = () -> java.time.LocalTime.now();
    System.out.println(timeSupplier.get());
  } 
}
