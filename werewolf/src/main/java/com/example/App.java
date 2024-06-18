package com.example;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.websocket.ContainerProvider;
import javax.websocket.DeploymentException;
import javax.websocket.Session;
import javax.websocket.WebSocketContainer;

import interfaz.InicioPrincipal;

public class App {

    private static Session session;

    public static void main(String[] args) {
        System.out.println("Iniciando cliente...");
        InicioPrincipal Intertface = new InicioPrincipal();
        Intertface.setVisible(true);
        System.out.println("Cliente iniciado");

        // Connect to WebSocket server
        connectToWebSocketServer();
    }

    private static void connectToWebSocketServer() {
        try {
            WebSocketContainer container = ContainerProvider.getWebSocketContainer();
            URI uri = new URI("ws://localhost:8080/websockets/werewolf");
            session = container.connectToServer(MyClientEndpoint.class, uri);
            System.out.println("Conectado al servidor en " + uri);
        } catch (DeploymentException | URISyntaxException e) {
            System.err.println("Fallo al conectar al servidor");
        } catch (IOException e) {
            System.err.println("Error de entrada/salida");
        } catch (Exception e) {
            System.err.println("Error inesperado: " + e.getMessage());
        }
    }

    public static void sendMessage(String message) {
        if (session != null && session.isOpen()) {
            session.getAsyncRemote().sendText(message);
        } else {
            System.err.println("No se pudo enviar el mensaje: la sesión no está abierta");
        }
    }
}