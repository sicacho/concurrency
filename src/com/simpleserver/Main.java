package com.simpleserver;

import com.util.Util;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by khangtnse60992 on 2/13/2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8080);
        while (true) {
            Socket s = ss.accept();
            Util.process(s);
        }

    }

}
