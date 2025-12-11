package ma.projet.eureka_server.config;

import com.netflix.discovery.shared.transport.jersey3.Jersey3TransportClientFactories;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Jersey3TransportClientFactoriesConfig {

    @Bean
    public Jersey3TransportClientFactories jersey3TransportClientFactories() {
        // Bean nécessaire pour que Eureka crée le eurekaClient correctement
        return new Jersey3TransportClientFactories();
    }
}
