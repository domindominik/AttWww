package att;

import config.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AttWwwApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(AttWwwApplication.class, args);
		//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
	}
}
