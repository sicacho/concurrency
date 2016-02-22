package com.simpleserver;

import com.util.Util;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by khangtnse60992 on 2/14/2016.
 */
public class MainThreadServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8080);
        while (true) {
            Socket s = ss.accept();
            new Thread(()-> Util.process(s)).start();
        }
    }
}
