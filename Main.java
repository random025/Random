import java.util.Random;
import mypackage.MyClass;

public class Main {
    public static void main(String[] args) {
        // Using a class from the inbuilt package (java.util)
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        System.out.println("Random Number: " + randomNumber);

        // Using a class from the user-defined package (mypackage)
        MyClass myObject = new MyClass();
        myObject.display();
    }
}
