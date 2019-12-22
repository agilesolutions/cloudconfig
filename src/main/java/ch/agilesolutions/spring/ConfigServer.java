package ch.agilesolutions.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * read https://www.baeldung.com/spring-cloud-configuration
 * @author Carol
 *
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServer {
     
    public static void main(String[] arguments) {
        SpringApplication.run(ConfigServer.class, arguments);
    }
}