import java.rmi.*;

interface ServerIntf extends Remote {
    // access_specifier return_type method_name(parameter_list)
    public double Add(double a, double b) throws RemoteException;

    public double Sub(double a, double b) throws RemoteException;

    public double Mul(double a, double b) throws RemoteException;

    public double Div(double a, double b) throws RemoteException;
}