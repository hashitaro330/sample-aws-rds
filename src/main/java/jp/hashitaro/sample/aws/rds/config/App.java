package jp.hashitaro.sample.aws.rds.config;

import jp.hashitaro.sample.aws.rds.domain.service.SampleService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(App.class, args);
        SampleService sampleService = applicationContext.getBean(SampleService.class);
    }
}
