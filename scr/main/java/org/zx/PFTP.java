package org.zx;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class PFTP {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(10086);
            while (true){
                /*Scanner sin = new Scanner(System.in);
                if(sin.hasNext() && "stop".equals(sin.next())) break;*/
                Socket client = server.accept();
                new Thread(new VFTPServer(client)).start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
