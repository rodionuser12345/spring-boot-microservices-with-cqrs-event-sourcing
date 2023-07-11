package com.rodion.springboot.usercommandapiproject;

import com.rodion.springboot.usercoreproject.config.AxonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableResourceServer
@EnableGlobalMethodSecurity(prePostEnabled = true)
@SpringBootApplication
@Import({AxonConfig.class})
public class UserCommandApiProjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserCommandApiProjectApplication.class, args);
    }

}
