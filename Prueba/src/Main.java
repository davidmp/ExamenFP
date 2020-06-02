import io.github.konohiroaki.annotationprocessor.timer.Timer;
public class Main {
    @Timer({1, 6})
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello0");
        //Thread.sleep(300);
        System.out.println("Hello2");
        System.out.println("Hello3");
        System.out.println("Hello4");
        //Thread.sleep(1000);
        System.out.println("Hello6");
        System.out.println("Hello7");
        //Thread.sleep(200);
        System.out.println("Hello9");
    }    
}