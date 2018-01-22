package com.masivian.SchoolApp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main App
 *
 */
@SpringBootApplication
public class App implements CommandLineRunner
{
    public static void main( String[] args )
    {
       SpringApplication.run(App.class, args);
    }
    
	public void run(String... arg0) throws Exception {
    	System.out.println("Running...");
    }
}
