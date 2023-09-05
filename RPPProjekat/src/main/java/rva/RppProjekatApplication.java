package rva;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Arrays;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;


@SpringBootApplication //anotacija koja se koristi u klasi koja sluzi za pokretanje aplikacije
public class RppProjekatApplication {

	public static void main(String[] args) {
		SpringApplication.run(RppProjekatApplication.class, args);
	}

    @Bean
    CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args ->{
			System.out.println("Beans provided by Spring Boot:");
			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for(String beanName:beanNames) {
				System.out.println(beanName);
			}
		};
	}
}
