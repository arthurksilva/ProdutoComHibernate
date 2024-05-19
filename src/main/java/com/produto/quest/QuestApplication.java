package com.produto.quest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuestApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuestApplication.class, args);
	
        // Usando o construtor padrão e setters
        Produto produto1 = new Produto();
        produto1.setNome("Produto A");
        produto1.setPreco(100.0);
        
        Produto produto2 = new Produto("Produto B", 200.0);

        System.out.println(produto1);
        System.out.println(produto2);
    }

}
