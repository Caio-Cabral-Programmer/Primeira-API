package com.programmer.caiocabral.api.primeira;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

// Isso é tudo! O Spring Boot configura automaticamente:
// - Servidor web embutido (Tomcat)
// - DispatcherServlet
// - Configurações padrão
// - Componentes e beans
// - Muito mais...