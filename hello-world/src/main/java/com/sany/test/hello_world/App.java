package com.sany.test.hello_world;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Hello world!
 *
 */
@Controller
@SpringBootApplication
@Configuration
public class App{
	
	@RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello world！";
    }
	
    public static void main( String[] args ){
    	SpringApplication.run(App.class, args);
    }
}
