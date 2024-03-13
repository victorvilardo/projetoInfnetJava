package infnet.com.br.projetoInfnetJava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"infnet.com.br.projetoInfnetJava.service"})
@EntityScan("infnet.com.br.projetoInfnetJava.model")
@EnableJpaRepositories("infnet.com.br.projetoInfnetJava.repository")
public class ProjetoInfnetJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoInfnetJavaApplication.class, args);
	}

}
