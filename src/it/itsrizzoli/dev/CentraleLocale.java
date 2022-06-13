package it.itsrizzoli.dev;

import java.io.IOException;
import java.net.*;
import java.util.concurrent.TimeUnit;

public class CentraleLocale {

    public static void main(String[] args) throws IOException {

            // IOException include SocketException
            // preparo il buffer in bytes ed il packet
            byte[] buffer = new byte[1024];
            DatagramPacket dp = new DatagramPacket(buffer, 1024);

            // Porta in ricezione
            int localPort = 6789;
            // Socket in ricezione
            DatagramSocket DataReceiver = new DatagramSocket(localPort);
            System.out.println("Server: in ascolto");
            // metto il server in ascolto

            while (true) {

                DataReceiver.receive(dp);
                // trasformo i bytes ricevuti in stringa
                String receivedString = new String(dp.getData(), 0, dp.getLength());
                System.out.println(receivedString);

            }
    }
}
