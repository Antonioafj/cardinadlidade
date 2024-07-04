package br.com.youtube.cardinalidade;

import br.com.youtube.cardinalidade.model.Teacher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class CardinalidadeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardinalidadeApplication.class, args);
	}

}
