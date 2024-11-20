package com.example.social_serice.Conf;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component
public class BookDiscussionWebSocketHandler extends TextWebSocketHandler {

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        // Handle incoming message and broadcast it to all connected clients
        String messageContent = message.getPayload();

        // Here you can parse the incoming message and decide what to do with it
        // For example, sending a new comment or reaction to all clients in the discussion

        System.out.println("Received message: " + messageContent);

        // Send a message back to the client (you could also broadcast to all connected clients if needed)
        session.sendMessage(new TextMessage("Message received: " + messageContent));
    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        // This is called when a client establishes a WebSocket connection
        System.out.println("New WebSocket connection established: " + session.getId());
        // Optionally, you could add the session to a list for broadcasting messages to all clients later
    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        // Handle errors that occur during communication
        System.err.println("WebSocket error: " + exception.getMessage());
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, org.springframework.web.socket.CloseStatus closeStatus) throws Exception {
        // Clean up when the WebSocket connection is closed
        System.out.println("WebSocket connection closed: " + session.getId());
    }
}
