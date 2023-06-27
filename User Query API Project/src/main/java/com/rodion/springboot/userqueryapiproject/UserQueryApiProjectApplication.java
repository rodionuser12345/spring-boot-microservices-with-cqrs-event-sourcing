package com.rodion.springboot.userqueryapiproject;

import com.rodion.springboot.usercoreproject.config.AxonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({AxonConfig.class})
public class UserQueryApiProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserQueryApiProjectApplication.class, args);
    }

}
