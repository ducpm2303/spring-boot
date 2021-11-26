package main;

import main.other.OtherGirl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan("main.other") chi tim cac bean trong package other
//@SpringBootApplication(scanBasePackages = "main.other") chi tim cac bean trong package other
@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(MainApplication.class, args);
		try {
			Girl girl = context.getBean(Girl.class);
			System.out.println("Bean: " + girl.toString());
		} catch (Exception e) {
			System.out.println("Bean Girl không tồn tại");
		}

		try {
			OtherGirl otherGirl = context.getBean(OtherGirl.class);
			if (otherGirl != null) {
				System.out.println("Bean: " + otherGirl.toString());
			}
		} catch (Exception e) {
			System.out.println("Bean Girl không tồn tại");
		}
	}

}
