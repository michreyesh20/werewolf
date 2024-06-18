package com.example;

import java.util.Scanner;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.glassfish.tyrus.server.Server;

@ServerEndpoint(value = "/werewolf")
public class webSocketServer {

    private static ConcurrentHashMap<String, Session> clients = new ConcurrentHashMap<>();
    private String clientId;

    @OnOpen
    public void onOpen(Session session) {
        clientId = UUID.randomUUID().toString();
        clients.put(clientId, session);
        System.out.println("Cliente conectado: " + clientId);
    }

    @OnClose
    public void onClose(Session session) {
        clients.remove(clientId);
        System.out.println("Cliente desconectado: " + clientId);
    }

    @OnMessage
    public String onMessage(String message, Session session) {
        System.out.println("Mensaje de: " + clientId + ": " + message);
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

            // Start a new thread to read messages from the terminal and send to clients
            new Thread(() -> {
                Scanner scanner = new Scanner(System.in);
                while (true) {
                    String message = scanner.nextLine();
                    sendMessageToAllClients(message);
                }
            }).start();

            // Keep the server running
            Thread.currentThread().join();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            server.stop();
        }
    }

    private static void sendMessageToAllClients(String message) {
        for (Session session : clients.values()) {
            if (session.isOpen()) {
                session.getAsyncRemote().sendText(message);
            }
        }
    }
}
