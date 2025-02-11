package tn.esprit.springprod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class SpringProdApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringProdApplication.class, args);
    }

}
