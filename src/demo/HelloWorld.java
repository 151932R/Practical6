/**
 * Created by KyleV_000 on 14/11/2016.
 */

package demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/hello")
public class HelloWorld {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMessage() {
        return "Hello World!";
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getMessages() {
        return "<b>Hello Worlds!</b>";
    }

    @GET
    @Produces(MediaType.TEXT_XML)
    public String getMessagess() {
        return "Hello Worldss!";
    }
}