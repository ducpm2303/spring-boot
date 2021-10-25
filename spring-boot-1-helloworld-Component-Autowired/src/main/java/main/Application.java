package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        ApplicationContext applicationContext =  SpringApplication.run(Application.class, args);

        // Khi chạy xong, lúc này context sẽ chứa các Bean có đánh
        // dấu @Component.

        Outfit outfit = applicationContext.getBean(Outfit.class);
        System.out.println("Instance: " + outfit);
        outfit.wear();

        Boy boy = applicationContext.getBean(Boy.class);
        System.out.println("Boy instance:" + boy);
        System.out.println("Boy outfit: " + boy.outfit);
        boy.outfit.wear();
    }

}
