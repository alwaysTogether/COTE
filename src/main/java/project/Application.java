package project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import project.service.SampleService;

@SpringBootApplication
public class Application implements CommandLineRunner{
    
    @Autowired
    private SampleService sampleService;
    
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    public void run(String... args) throws Exception {
        sampleService.print();
    }
}