import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.Naming;

public class example1 {
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        rmiServer.RemoteHelloWorld h = new rmiServer.RemoteHelloWorld();
        String[] s = Naming.list("rmi://127.0.0.1:1099");
        System.out.println(s);
    }
}
