import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class PortScanner {
    public static void main(String[] args) {
        // Take IP address and port(1-1000) from user.
        System.out.println("Enter IP Address:");
        String ipAddress = System.console().readLine();
        System.out.println("Enter Port(1-1000)\nPort Start:");
        int portStart = Integer.parseInt(System.console().readLine());
        System.out.println("Port End:");
        int portEnd = Integer.parseInt(System.console().readLine());

        // Send connection request for every port.
        for (int port = portStart; port <= portEnd; port++) {
            try {
                // Create a TCP connection.
                Socket socket = new Socket(ipAddress, port);

                // If request success, port is open.
                System.out.println("Port " + port + " open.");

                socket.close();
            } catch (IOException e) {
                // If request fails, port is close.
                System.out.println("Port " + port + " close.");
            }
        }
    }
}