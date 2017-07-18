package ro.test.spring.boot.basicbootapp;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicBootAppApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		SpringApplication.run(BasicBootAppApplication.class, args);
		
		//new BufferedInputStream(System.in).read();
		
		//Thread.sleep(10000);
	}
}
