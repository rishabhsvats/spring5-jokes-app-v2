package com.rishabh.spring5jokesappv2;

import com.rishabh.spring5jokesappv2.controller.JokeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5JokesAppV2Application {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(Spring5JokesAppV2Application.class, args);

	}

}
