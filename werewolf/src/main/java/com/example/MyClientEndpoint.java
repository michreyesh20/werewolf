package com.example;

import javax.websocket.ClientEndpoint;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;

@ClientEndpoint
public class MyClientEndpoint {

    @OnOpen
    public void onOpen(Session session) {
        System.out.println("Cliente conectado ... " + session.getId());
    }

    @OnClose
    public void onClose(Session session) {
        System.out.println("Cliente desconectado ... " + session.getId());
    }

    @OnMessage
    public void onMessage(String message, Session session) {
        System.out.println("Mensaaje recibido: " + message);
    }
}
