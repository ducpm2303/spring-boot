package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(MainApplication.class, args);
		Girl girl = applicationContext.getBean(Girl.class);

		System.out.println("Girl Instance of: " + girl);
		System.out.println("Girl Outfit " + girl.outfit);
		girl.outfit.wear();
	}

}
