package rva.ctrls;

import java.util.Arrays;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllers {
	
	@RequestMapping("/") //sluzi za mapiranje web zahteva, da otvori u webu ovo sto je ispisano
	public String helloWorld() {
		return "Hello World!";
	}
	
	@RequestMapping("zbir")
	public String zbir() {
		long x = Math.round(Math.random() * 10);
		long y = Math.round(Math.random() * 10);
		return x+ " + " + y + " = " + (x+y);
	}
	
	/*@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) { //da vidimo sta Spring radi u pozadini
		return args -> {
			System.out.println("Beans provided by Spring Boot:");
			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames); //ovde se pravi lista kako bi videli sva desavanja koja Spring odradjuje u pozadini
			for(String beanName: beanNames) {
				System.out.println(beanName);
			}
		};
	
	}
*/
}
