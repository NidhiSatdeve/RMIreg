import java.rmi.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            String serverURL = "rmi://localhost/Server";
            ServerIntf server = (ServerIntf) Naming.lookup(serverURL);

            System.out.print("Enter first number: ");
            double a = sc.nextDouble();
            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            System.out.println("First number is " + a);
            System.out.println("Second number is " + b);

            System.out.println("Results:");
            System.out.println("Addition: " + server.Add(a, b));
            System.out.println("Subtraction: " + server.Sub(a, b));
            System.out.println("Multiplication: " + server.Mul(a, b));
            System.out.println("Division: " + server.Div(a, b));
        } catch (Exception e) {
            System.out.println("Client exception: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
