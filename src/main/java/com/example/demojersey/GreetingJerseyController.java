/**
 * 
 */
package com.example.demojersey;

import java.util.concurrent.atomic.AtomicLong;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

/**
 * @author x173117
 * 
 *         http://localhost:8080/rest/greeting
 * 
 *         mettre WS à la place du starter <dependency>
 *         <groupId>org.springframework.boot</groupId>
 *         <artifactId>spring-boot-starter-jersey</artifactId> </dependency>
 *
 */
@Component
@Path("/greeting")
public class GreetingJerseyController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Greeting greeting(@PathParam(value = "name") String name) {
        if (name == null) {
            name = "test";
        }
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
