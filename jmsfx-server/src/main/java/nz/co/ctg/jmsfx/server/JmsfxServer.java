package nz.co.ctg.jmsfx.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class JmsfxServer {

    public static void main(String[] args) {
        SpringApplication.run(JmsfxServer.class, args);
    }

}
