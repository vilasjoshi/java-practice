package com.test.qcal;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalApplication {

	public static void main(String[] args) {
		//SpringApplication.run(QcalApplication.class, args);

		System.out.println("Hello World");

		StandardCalculator calc = new StandardCalculator();

		calc.add(12, 20);
		System.out.println(calc.result);
	}

}
