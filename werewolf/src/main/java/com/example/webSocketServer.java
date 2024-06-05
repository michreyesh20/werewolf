package com.example;

import javax.websocket.OnOpen;
import javax.websocket.OnMessage;
import javax.websocket.OnClose;
import javax.websocket.Session;
import javax.websocket.OnError;
import javax.websocket.server.ServerEndpoint;
import org.glassfish.tyrus.server.Server;

@ServerEndpoint(value = "/werewolf")
public class webSocketServer {

        @OnOpen
        public void onOpen(Session session) {
            System.out.println("Connected ... " + session.getId());
        }

        @OnClose
        public void onClose(Session session) {
            System.out.println("Disconnected ... " + session.getId());
        }

        @OnMessage
        public String onMessage(String message, Session session) {
            System.out.println("Received: " + message);
            return "Received: " + message;
        }

        @OnError
        public void onError(Throwable e) {
            e.printStackTrace();
        }

    public static void main(String[] args) {
    Server server = new Server("localhost", 8080, "/websockets", null, webSocketServer.class);
    try {
        server.start();
        System.out.println("Server started at ws://localhost:8080/websockets/werewolf");
        // Mantener el servidor en funcionamiento
        Thread.currentThread().join();
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        server.stop();
    }
}

}

// jugadores[] = {jugador1, jugador2, jugador3, jugador4, jugador5, jugador6, jugador7, jugador8, jugador9, jugador10}
// jugadoresAdmitidos = int
// jugadoresMaximos = int
// escenarioActual = String