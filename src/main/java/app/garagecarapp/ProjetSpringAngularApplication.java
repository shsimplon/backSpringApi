package app.garagecarapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "app.garagecarapp.repository"
)
public class ProjetSpringAngularApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetSpringAngularApplication.class, args);
	}

}
