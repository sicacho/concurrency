package com.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by khangtnse60992 on 2/13/2016.
 */
public class Util {
    public static int transmogrify(int data) {
        if(Character.isLetter(data)) return data ^ ' ';
        return data;
    }

    public static void process(Socket s) {
        System.out.println("connect from " + s);
        try(InputStream in = s.getInputStream();
            OutputStream out = s.getOutputStream()) {
            int data ;
            while ((data = in.read())!=-1) {
                data = transmogrify(data);
                out.write(data);
            }
        } catch (IOException e) {
            System.out.println("connection problem");
        }
    }
}
