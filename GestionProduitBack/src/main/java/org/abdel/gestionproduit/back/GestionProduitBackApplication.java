package org.abdel.gestionproduit.back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.AdviceMode;

@SpringBootApplication
@EnableCaching(mode = AdviceMode.ASPECTJ)
public class GestionProduitBackApplication {

	public static void main(String[] args) {
		System.out.println(System.getProperty("java.io.tmpdir"));
		SpringApplication.run(GestionProduitBackApplication.class, args);
	}
}
