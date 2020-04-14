package ua.lviv.iot.springLabSeven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"ua.lviv.iot.dataAccess", "ua.lviv.iot.business", "ua.lviv.iot.springLabSeven.secondRest.controller"})
@EnableJpaRepositories({ "ua.lviv.iot.dataAccess" })
public class SecondRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecondRestApplication.class, args);
    }

}

