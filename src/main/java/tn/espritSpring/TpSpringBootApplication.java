package tn.espritSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling 

public class TpSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(TpSpringBootApplication.class, args);
	}

}
