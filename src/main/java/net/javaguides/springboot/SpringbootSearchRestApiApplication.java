package net.javaguides.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
class DemoStart{

	public void showMsg(){
		System.out.println("Spring JPA Application Started.");
	}
}

@SpringBootApplication
public class SpringbootSearchRestApiApplication {

	public static void main(String[] args) {
		ApplicationContext ap = SpringApplication.run(SpringbootSearchRestApiApplication.class, args);
		DemoStart ds = ap.getBean(DemoStart.class);
		ds.showMsg();
	}

}
