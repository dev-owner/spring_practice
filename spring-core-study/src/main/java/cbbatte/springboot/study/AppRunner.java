package cbbatte.springboot.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.MessageSource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Locale;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    BookRepository bookRepository;

    @Value("${app.name}")
    String appName;

    @Autowired
    MessageSource messageSource;

    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    @Autowired
    ResourceLoader resourceLoader;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Environment environment = applicationContext.getEnvironment();
        System.out.println(environment.getProperty("app.name"));
        System.out.println(appName);
        String greeting = messageSource.getMessage("greeting", new String[]{"jaewoo"}, Locale.KOREA);
        String greeting1 = messageSource.getMessage("greeting", new String[]{"jaewoo"}, Locale.getDefault());


        System.out.println("greeting1 = " + greeting1);
        System.out.println("greeting = " + greeting);

        applicationEventPublisher.publishEvent(new MyEvent(this, 100));

        Resource resource = resourceLoader.getResource("classpath:test.txt");
        System.out.println(resource.exists());
        String description = resource.getDescription();
        System.out.println("description = " + description);

    }
}
