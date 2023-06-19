import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer>0;
            }
        };

        Predicate<Integer>predicate1 = i -> i>0;

        System.out.println(predicate.test(8));
        System.out.println(predicate1.test(-12));

//        ==============

        Consumer<String>consumer = new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println("Hi, " + name);
            }
        };

        Consumer<String>consumer1 = name -> System.out.println("Hi " + name);

        consumer1.accept("Le");
        consumer.accept("Jak");
//        ==============
        Function<Double,Long>function = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return aDouble.longValue();
            }
        };

        Function <Double,Long>function1 = d -> d.longValue();

        System.out.println(function.apply(3.14));
        System.out.println(function1.apply(5.78));
//        ============

        Supplier<Integer>supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                double random = Math.random()*100;
                return (int) random;
            }
        };

        Supplier<Integer>supplier1 = () -> (int) (Math.random() * 100);

        System.out.println(supplier.get());
    }
}