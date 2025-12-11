package ma.projet.order_service.web;

import ma.projet.order_service.client.ClientServiceClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    private final ClientServiceClient clientServiceClient;

    public OrderController(ClientServiceClient clientServiceClient) {
        this.clientServiceClient = clientServiceClient;
    }

    @GetMapping("/hello-order")
    public String helloOrder() {
        return "Hello from ORDER-SERVICE !";
    }

    @GetMapping("/orders/with-client")
    public String orderWithClient() {
        String msgClient = clientServiceClient.sayHelloFromClient();
        return "Order-Service -> appel de CLIENT-SERVICE : " + msgClient;
    }
}
