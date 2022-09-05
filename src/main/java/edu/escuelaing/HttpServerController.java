package edu.escuelaing;

public class HttpServerController {
    public static void main(String[] args) {
        HttpServer server = HttpServer.getInstance();
        try {
            Spring.run();
            server.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}