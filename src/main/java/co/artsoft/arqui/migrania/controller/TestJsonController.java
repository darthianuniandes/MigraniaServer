package co.artsoft.arqui.migrania.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.artsoft.arqui.migrania.entity.TestJson;

@RestController
public class TestJsonController {
	
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/testISM")
	public TestJson test(@RequestParam(value="name", defaultValue="World") String name) {
		
		System.out.println(name);
		
		TestJson tj = new TestJson();
		tj.setId(counter.incrementAndGet());
		tj.setContent(String.format(template, name));
		
	    System.out.println(tj);
	    return tj;
	}
}
