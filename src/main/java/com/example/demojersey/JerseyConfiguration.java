/**
 * 
 */
package com.example.demojersey;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

/**
 * @author x173117
 *
 *
 */
@Configuration
@ApplicationPath("rest")
public class JerseyConfiguration extends ResourceConfig {

    /**
     * 
     */

    public JerseyConfiguration() {
        // TODO Auto-generated constructor stub
    }

    @PostConstruct
    public void setUp() {
        register(GreetingJerseyController.class);
        register(GenericExceptionMapper.class);
    }

}
