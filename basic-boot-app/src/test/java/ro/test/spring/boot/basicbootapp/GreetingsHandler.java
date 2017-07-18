package ro.test.spring.boot.basicbootapp;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import scala.annotation.varargs;

@RestController
public class GreetingsHandler {
	
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/greetings")
	public Person greetings(@RequestParam(value="name", defaultValue="World") String name) {
		return new Person(counter.incrementAndGet(), String.format("Hello, %s!", name) );
	}
	
}
