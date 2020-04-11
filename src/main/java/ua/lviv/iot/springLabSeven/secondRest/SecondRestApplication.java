package ua.lviv.iot.springLabSeven.secondRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({ "ua.lviv.iot.springLabSeven.secondRest.dataAccess", "ua.lviv.iot.springLabSeven.secondRest.business" })
@EnableJpaRepositories({ "ua.lviv.iot.springLabSeven.secondRest.dataAccess" })
public class SecondRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecondRestApplication.class, args);
    }

}
