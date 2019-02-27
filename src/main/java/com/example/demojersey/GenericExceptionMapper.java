/**
 * 
 */
package com.example.demojersey;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

/**
 * @author x173117
 *
 */
public class GenericExceptionMapper implements ExceptionMapper<Throwable> {

    /**
     * 
     */
    public GenericExceptionMapper() {
        // TODO Auto-generated constructor stub
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.ws.rs.ext.ExceptionMapper#toResponse(java.lang.Throwable)
     */
    @Override
    public Response toResponse(Throwable exception) {
        return Response.serverError().entity(exception.getMessage()).build();
    }

}
