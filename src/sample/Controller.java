package sample;

import java.awt.*;
import java.io.IOException;
import java.net.*;
import java.nio.ByteBuffer;

public class Controller {
public void mouseMoved(){
    try {
        byte[] bytes = ByteBuffer.allocate(5).putInt(MouseInfo.getPointerInfo().getLocation().x).array();
        System.out.println(MouseInfo.getPointerInfo().getLocation().x);
        DatagramSocket datagramSocket = new DatagramSocket();
        DatagramPacket datagramPacket = new DatagramPacket(bytes,5, InetAddress.getByName("192.168.2.171"),3333);
        datagramSocket.send(datagramPacket);
        datagramSocket.close();
    } catch (SocketException | UnknownHostException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }

}

}
