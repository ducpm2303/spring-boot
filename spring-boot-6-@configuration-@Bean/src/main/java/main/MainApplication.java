package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(MainApplication.class, args);
		SimpleBean simpleBean = context.getBean(SimpleBean.class);
		System.out.println("Simple Bean Example: " + simpleBean.toString());

		DatabaseConnector mysql = (DatabaseConnector) context.getBean("mysqlConnector");
		mysql.connect();

		DatabaseConnector mongodb = (DatabaseConnector) context.getBean("mongodbConnector");
		mongodb.connect();

		DatabaseConnector postgresql = (DatabaseConnector) context.getBean("postgresqlConnector");
		postgresql.connect();
	}

}
