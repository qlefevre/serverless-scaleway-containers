import io.undertow.Undertow;
import io.undertow.util.Headers;
public class Handler {

    public static final int DEFAULT_PORT = 8080;

    public static void main(String[] args) {
        int port = Integer.getInteger("PORT",DEFAULT_PORT);
        Undertow server = Undertow.builder()
                .addHttpListener(port, "0.0.0.0")
                .setHandler(exchange -> {
                    exchange.getResponseHeaders().put(Headers.CONTENT_TYPE, "application/json");
                    exchange.getResponseSender().send("""
                        {
                            "message":  "Hello, World from Scaleway Container !"
                        }""");
                }).build();
        server.start();
    }
}
