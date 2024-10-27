public class SampleFactory {
    static Sample createSample(int number){
        return switch (number){
            case int i when i % 3 == 0 -> new Sample("one", 42);
            case int i when i % 2 == 0 -> new Sample("two", 22);
            default -> new Sample("", -1);
        };
    }
}
