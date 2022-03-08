package com.polynome;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PolynomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PolynomeApplication.class, args);
		
		
		
	}
	@Bean
    CommandLineRunner start(){
        return args -> {
        	int[] t1 = {1,2,3};
    		int[] t2 = {0,2,1,4};
    		int[] s = {1,4,4,4};
    		Polynome pl = new Polynome(t1);
    		Polynome pl1 = new Polynome(t2);
    		Polynome pl2 = pl.addition(pl1);
    		System.out.println(pl2);
        };
    }

}
