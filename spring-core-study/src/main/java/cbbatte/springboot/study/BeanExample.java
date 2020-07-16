package cbbatte.springboot.study;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanExample {
    @Bean
    public BookRepository bookRepository() {
        return new MyBookRepository();
    }
}
