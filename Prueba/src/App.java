import upeu.JsonSerializer;

public class App {
    public static void main(final String[] args) throws Exception {
        System.out.println("Hello, World!");
        Car car = new Car("Ford", "F150", "2018");
        JsonSerializer serializer = new JsonSerializer();
        serializer.serialize(car);        
    }
}
