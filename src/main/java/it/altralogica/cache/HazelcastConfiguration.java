package it.altralogica.cache;

import com.hazelcast.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by tanis on 18/05/17.
 */
@Configuration
public class HazelcastConfiguration {
    @Bean
    public Config config() {
        return new Config();
    }
}
