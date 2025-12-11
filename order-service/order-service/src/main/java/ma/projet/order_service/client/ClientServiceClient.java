package ma.projet.order_service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "CLIENT-SERVICE")   // même nom que spring.application.name du client-service
public interface ClientServiceClient {

    @GetMapping("/hello")
    String sayHelloFromClient();
}
