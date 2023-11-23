import javax.websocket.*;
import java.net.URI;

@ClientEndpoint
public class WebSocketClientExample {
    @OnMessage
    public void onMessage(String message, Session session) {
        System.out.println("Received message: " + message);
    }

    public static void main(String[] args) throws Exception {
        WebSocketContainer container = ContainerProvider.getWebSocketContainer();
        Session session = container.connectToServer(WebSocketClientExample.class, new URI("ws://localhost:8080/websocket"));

        // Send a message to the WebSocket server
        session.getBasicRemote().sendText("Hello, WebSocket!");
    }
}
