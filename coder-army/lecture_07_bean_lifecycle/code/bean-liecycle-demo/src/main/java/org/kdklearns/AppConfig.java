package org.kdklearns;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan
public class AppConfig {

//    @Bean(initMethod = "preUse", destroyMethod = "preDestroy")
//    @Primary
//    public CartService createCartService() {
//        return new CartService();
//    }
}
