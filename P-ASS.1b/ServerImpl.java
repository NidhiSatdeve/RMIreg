import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class ServerImpl extends UnicastRemoteObject implements ServerIntf {
    public ServerImpl() throws RemoteException {
        super();
    }

    public double Add(double a, double b) throws RemoteException {
        return a + b;
    }

    public double Sub(double a, double b) throws RemoteException {
        return a - b;
    }

    public double Mul(double a, double b) throws RemoteException {
        return a * b;
    }

    public double Div(double a, double b) throws RemoteException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        if (a == 0) {
            return 0;
        }
        return a / b;
    }
}
