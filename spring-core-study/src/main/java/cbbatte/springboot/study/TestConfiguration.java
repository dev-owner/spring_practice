package cbbatte.springboot.study;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("Test")
public class TestConfiguration {
    @Bean
    public BookRepository bookRepository() {
        return new MyBookRepository();
    }
}
